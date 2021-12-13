package linda.shm;

import linda.Callback;
import linda.Linda;
import linda.Tuple;
import java.util.*;
import java.util.concurrent.locks.*;
import Synchro.Assert;
/** Shared memory implementation of Linda. */
public class CentralizedLindaEvent implements Linda {
	// L'espace des Tuples qu'on va manipuler
    private List<Tuple> tupleSpace;
    // Mon moniteur
    private ReentrantLock monitor;
    // condition lecture (read)
    private Condition readPossible;
    // condition prise (take)
    private Condition takePossible;
    // condition Ã©criture (write)
    private Condition writePossible;
    // ecriture en cours ?
    private boolean currentlyWriting;
    // prise en cours ?
    private boolean currentlyTaking;     
    // nombre de lecteurs en cours
    private int currentReaders;
    // nombre de lecteurs en attente
    private int waitingReaders;
    // nombre d'Ã©crivains en attente
    private int waitingWriters;


    public CentralizedLindaEvent() {

        monitor = new ReentrantLock();
        readPossible = monitor.newCondition();
        takePossible = monitor.newCondition();
        writePossible = monitor.newCondition();
        currentlyTaking = false;
        currentlyWriting = false;
        currentReaders = 0;
        waitingReaders = 0;
        waitingWriters = 0;
        tupleSpace = new ArrayList<>();

    }

    // Demande Lecture
    private void startReading() throws InterruptedException {

        monitor.lock();       
        while(currentlyWriting || currentlyTaking) {
            waitingReaders++;
            readPossible.await();
            waitingReaders--;        
        }
        currentReaders++;
        readPossible.signal();
        monitor.unlock();

    }

    // Terminer Lecture
    private void finishReading() throws InterruptedException {

        monitor.lock();
        currentReaders--;
        if(currentReaders == 0) {
            if(waitingWriters > 0) {
                writePossible.signal();
            } else {
                takePossible.signal();
            }
        }
        monitor.unlock();

    }

    // Demander Prise
    private void startTaking() throws InterruptedException {

        monitor.lock();
        while(currentlyWriting || currentlyTaking || currentReaders != 0 || waitingReaders > 0 || waitingWriters > 0) {
            takePossible.await();
        }
        currentlyTaking = true;
        monitor.unlock();
    
    }

    // Terminer Prise
    private void finishTaking() throws InterruptedException {

        monitor.lock();
        currentlyTaking = false;
        if(waitingReaders > 0) {
            readPossible.signal();
        } else if(waitingWriters > 0) {
            writePossible.signal();
        } else {
            takePossible.signal();
        }
        monitor.unlock();

    }

    // Demander Prise
    private void startWriting() throws InterruptedException {

        monitor.lock();
        while(currentlyWriting || currentlyTaking || currentReaders != 0 || waitingReaders > 0) {
            waitingWriters++;
            writePossible.await();
            waitingWriters--;
        }
        currentlyWriting = true;
        monitor.unlock();
    
    }

    // Terminer Prise
    private void finishWriting() throws InterruptedException {

        monitor.lock();
        currentlyWriting = false;
        if(waitingReaders > 0) {
            readPossible.signal();
        } else if(waitingWriters > 0) {
            writePossible.signal();
        } else {
            takePossible.signal();
        }
        monitor.unlock();

    }

    /** Adds a tuple t to the tuplespace. */
    public void write(Tuple t) {
        try {
            startWriting();
            tupleSpace.add(t);
            finishWriting();
            
        } catch (InterruptedException e) {
            debug("khratWrite");
        }
    }

    /** Returns a tuple matching the template and removes it from the tuplespace.
     * Blocks if no corresponding tuple is found. */
    public Tuple take(Tuple template) {
        Tuple tuple = null;
        int indexOfTemplate = -1;
        try {
            while(indexOfTemplate == -1) {
            	startTaking();
            	indexOfTemplate = indexOfTemplate(tupleSpace, template);
                if(indexOfTemplate != -1) {
    	            tuple = tupleSpace.get(indexOfTemplate);
    	            tupleSpace.remove(indexOfTemplate);
                }
                finishTaking();
            }
        } catch ( InterruptedException e) {
            debug("khratTake");
        }
        return tuple;
    }

    /** Returns a tuple matching the template and leaves it in the tuplespace.
     * Blocks if no corresponding tuple is found. */
    public Tuple read(Tuple template) {
    	Tuple tuple = null;
        int indexOfTemplate = -1;
        try {
            while(indexOfTemplate == -1) {
            	startReading();
            	indexOfTemplate = indexOfTemplate(tupleSpace, template);
                if(indexOfTemplate != -1) {
    	            tuple = tupleSpace.get(indexOfTemplate);
                }
                finishReading();
            }
        } catch ( InterruptedException e) {
            debug("khratRead");
        }
        return tuple;
    }

    public void debug(String prefix) {
        System.out.println(prefix);
    }

    public Tuple tryTake(Tuple template) {
    	Tuple tuple = null;
        int indexOfTemplate = -1;
        try {
            startTaking();
            indexOfTemplate = indexOfTemplate(tupleSpace, template);
            if(indexOfTemplate != -1) {
            	tuple = tupleSpace.get(indexOfTemplate);
    	        tupleSpace.remove(indexOfTemplate);
            }
            finishTaking();
        } catch ( InterruptedException e) {
            debug("khratTryTake");
        }
        return tuple;
    }

    /** Returns a tuple matching the template and leaves it in the tuplespace.
     * Returns null if none found. */
    public Tuple tryRead(Tuple template) {
    	Tuple tuple = null;
        int indexOfTemplate = -1;
        try {
            startReading();
            indexOfTemplate = indexOfTemplate(tupleSpace, template);
            if(indexOfTemplate != -1) {
            	tuple = tupleSpace.get(indexOfTemplate);
            }
            finishReading();
        } catch ( InterruptedException e) {
            debug("khratTryRead");
        }
        return tuple;
    }

    /** Returns all the tuples matching the template and removes them from the tuplespace.
     * Returns an empty collection if none found (never blocks).
     * Note: there is no atomicity or consistency constraints between takeAll and other methods;
     * for instance two concurrent takeAll with similar templates may split the tuples between the two results.
     */
    public Collection<Tuple> takeAll(Tuple template) {
        Collection<Tuple> collection = new ArrayList<>();
    	try {
	    	startTaking();
	        for(Tuple t : tupleSpace) {
	            if(t.matches(template)) {
	                int indexOfTuple = tupleSpace.indexOf(t);
	                collection.add(tupleSpace.get(indexOfTuple));
	            }
	        }
	        tupleSpace.removeAll(collection);
			finishTaking();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return collection;
    }

    /** Returns all the tuples matching the template and leaves them in the tuplespace.
     * Returns an empty collection if none found (never blocks).
     * Note: there is no atomicity or consistency constraints between readAll and other methods;
     * for instance (write([1]);write([2])) || readAll([?Integer]) may return only [2].
     */
    public Collection<Tuple> readAll(Tuple template) {
        Collection<Tuple> collection = new ArrayList<>();
    	try {
	    	startReading();
	        for(Tuple t : tupleSpace) {
	            if(t.matches(template)) {
	                int indexOfTuple = tupleSpace.indexOf(t);
	                collection.add(tupleSpace.get(indexOfTuple));
	            }
	        }
			finishReading();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return collection;
    }


    /** Returns the value of the index of the first Tuple matching the template from the tupleSpace,
     * if it doesn't find a matching Tuple, it returns -1.
     */
    public int indexOfTemplate(List<Tuple> tupleSpace, Tuple template) {
        int indexOfTemplate = -1;
    	for(Tuple t : tupleSpace) {
            if(t.matches(template)) {
                indexOfTemplate = tupleSpace.indexOf(t);
            }
        }
        return indexOfTemplate;
    }

	@Override
    public void eventRegister(eventMode mode, eventTiming timing, Tuple template, Callback callback) {
		new Thread(() -> {try {
			if(timing.equals(eventTiming.FUTURE)) {
				int firstIndex = tupleSpace.size(); // index of the last written element before registering
				int lastIndex = firstIndex; // index of the last written element after registering and a write operation has been done				
				while(lastIndex == firstIndex ) {lastIndex = tupleSpace.size();}
				if(mode.equals(eventMode.TAKE)) {				
					startTaking();
					lastIndex = tupleSpace.size(); // in case a write operation was done just after exiting the previous while loop						
					for(int i = firstIndex; i<lastIndex; i++) { // on parcours les �lements ajout�s apr�s l'appel de eventRegister 
					Tuple t = tupleSpace.get(i);
					if(t.matches(template)) {
						tupleSpace.remove(i);
						callback.call(t);
						break;
					}}
					finishTaking();
				} else {
					startReading();
					lastIndex = tupleSpace.size(); // in case a write operation was done just after exiting the previous while loop						
					for(int i = firstIndex; i<lastIndex; i++) { // on parcours les �lements ajout�s apr�s l'appel de eventRegister 
					Tuple t = tupleSpace.get(i);
					if(t.matches(template)) {
						callback.call(t);
						break;
					}}
					finishReading();
				}
			} else {
				System.out.println(mode);
				if(mode.equals(eventMode.TAKE)) {
					System.out.println(mode);

					Tuple t = this.tryTake(template);
					System.out.println(mode);
					System.out.println(t);
					if (t != null) {
						callback.call(t);
					}
				} else {
					Tuple t = this.tryRead(template);
					if (t != null) {
						callback.call(t);
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();	
		}
    } ).start();
}}
