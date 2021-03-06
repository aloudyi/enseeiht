package linda.shm;

import linda.Callback;
import linda.Linda;
import linda.Tuple;
import linda.Linda.eventMode;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
/** Shared memory implementation of Linda. */
public class CentralizedLinda implements Linda {
	// L'espace des Tuples qu'on va manipuler
    private List<Tuple> tupleSpace;
    // Mon moniteur
    private ReentrantLock monitor;
    // condition lecture (read)\texton parcor
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
    // Les Reads bloqu?s selon les templates correspondant
    private HashMap<Tuple, BlockingQueue<Condition>> waitingReads  = new HashMap<>();
    // Les Takes bloqu?s selon les templates correspondant
	private HashMap<Tuple, BlockingQueue<Condition>> waitingTakes  = new HashMap<>();
	// Les Reads bloqu?s dans les calls 
	private HashMap<Tuple, BlockingQueue<Callback>> waitingReadsOfCalls  = new HashMap<>();
	// Les Takes bloqu?s dans les calls
	private HashMap<Tuple, BlockingQueue<Callback>> waitingTakesOfCalls  = new HashMap<>();

    public CentralizedLinda() {

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
    	if (t == null) {
    		throw new NullPointerException();
    	}
    	//monitor.lock();
        try {
            startWriting();
           
            // On ajoute le tuple au TupleSpace
            tupleSpace.add(t.deepclone());
            
            // PRIORITE AUX READS EN ATTENTE
            // On signale les reads en attente
        	for(Tuple template : waitingReads.keySet()){ // On parcours tous les templates de waitingRead pour v?rifier l'existence du notre
    			if(t.matches(template)){
    				// On signale toutes les conditions li?es au template donn?
    				for (Condition c : waitingReads.get(template)) {
    					monitor.lock();
    		    		c.signal();
    		    		monitor.unlock();
    					// On supprime la condition de la liste apr?s l'avoir signal?
    					waitingReads.get(template).remove(c);
    				}
    			}
    		}
        	
        	// GESTION DES READS PROVENANT DES CALLBACK FUTURE
        	for(Tuple template : waitingReadsOfCalls.keySet()){ // On parcours tous les templates de waitingReadsOfCalls pour v?rifier l'existence du notre
    			if(t.matches(template)){
    				// On call tous les callbacks li?s au template donn? 
    				for(Callback call : waitingReadsOfCalls.get(template)){
    					new Thread(() -> {
    						Tuple te = read(t);
    			    		call.call(te);
    					}).start();
    					// On supprime le callback apr?s l'avoir call?
    					waitingReadsOfCalls.get(template).remove(call);
    				}
    			}
    		}
        	
        	// GESTION DES TAKES 
        	for(Tuple template : waitingTakes.keySet()){ // On parcours tous les templates de waitingRead pour v?rifier l'existence du notre
    			if(t.matches(template)){
    				// On signale toutes les conditions li?es au template donn?
    				for (Condition c : waitingTakes.get(template)) {
    					monitor.lock();
    					c.signal();
    					monitor.unlock();
    					// On supprime la condition du tableau apr?s l'avoir signal?
    					waitingTakes.get(template).remove(c);
    				}
    			}
    		}
        	
        	// GESTION DES TAKES PROVENANT DES CALLBACK FUTURE
        	for(Tuple template : waitingTakesOfCalls.keySet()){ // On parcours tous les templates de waitingReadsOfCalls pour v?rifier l'existence du notre
    			if(t.matches(template)){
    				// On call tous les callbacks li?s au template donn? 
    				for(Callback call : waitingTakesOfCalls.get(template)){
    					new Thread(() -> {
    						Tuple te = take(t);
    			    		call.call(te);
    					}).start();
    					// On supprime le callback apr?s l'avoir call?
    					waitingTakesOfCalls.get(template).remove(call);
    				}
    			}
    		}
     
            finishWriting();
            
        } catch (InterruptedException e) {
            debug("khratWrite");
        }
       // monitor.unlock();
    }

    /** Returns a tuple matching the template and removes it from the tuplespace.
     * Blocks if no corresponding tuple is found. */
    public Tuple take(Tuple template) {
    	Tuple tuple = null;
		//monitor.lock();
		// Boucle qui breakera dans le cas o? on trouvera le tuple correspondant ult?rieurement apr?s un Write
		while (true) {
			// Version non bloquante de take qui sera utile pour savoir si on n'a pas trouv? le template donn?
			tuple = tryTake(template);
			if (tuple == null) {
				// On cr?e une condition qui sera signal?e en cas d'?criture d'un motif qui match le motif en attente de lecture
				Condition c = monitor.newCondition();
				// Si le template n'est pas pr?sent dans la HashMap, on le cr?e et on lui associe une liste de conditions qui l'attendent
				waitingTakes.putIfAbsent(template, new ArrayBlockingQueue<>(1000000, true));
				// On ajoute la condition ? la liste de conditions du template donn?
		    	waitingTakes.get(template).add(c);
		    	try {
		    		// On wait la condition en attente du signal qui proviendra du write
		    		monitor.lock();
		    		c.await();
		    		monitor.unlock();
		    	}
		    	catch (InterruptedException e) {
		    		System.out.println("Khrat Read");
		    	}
			} else {
				break;
			}
		}
		//monitor.unlock();
		return tuple;
    }

    /** Returns a tuple matching the template and leaves it in the tuplespace.
     * Blocks if no corresponding tuple is found. */
    public Tuple read(Tuple template) {
    	Condition c;
    	Tuple tuple = null;
		//monitor.lock();
		// Boucle qui breakera dans le cas o? on trouvera le tuple correspondant ult?rieurement apr?s un Write
		while (true) {
			// Version non bloquante de Read qui sera utile pour savoir si on n'a pas trouv? le template donn?
			tuple = tryRead(template);
			if (tuple == null) {
				// On cr?e une condition qui sera signal?e en cas d'?criture d'un motif qui match le motif en attente de lecture
				c = monitor.newCondition();
				// Si le template n'est pas pr?sent dans la HashMap, on le cr?e et on lui associe une liste de conditions qui l'attendent
				waitingReads.putIfAbsent(template, new ArrayBlockingQueue<>(1000000, true));
				// On ajoute la condition ? la liste de conditions du template donn?
		    	waitingReads.get(template).add(c);
		    	try {
		    		// On wait la condition en attente du signal qui proviendra du write
		    		monitor.lock();
		    		c.await();
		    		monitor.unlock();
		    	}
		    	catch (InterruptedException e) {
		    		System.out.println("Khrat Read");
		    	}
			} else {
				break;
			}
		}
		//monitor.unlock();
		return tuple;
    }

    public void debug(String prefix) {
    	monitor.lock();
    	try {
        System.out.println(prefix+") "+tupleSpace.toString());
    	} catch(Exception e) {
    		System.err.println("err print tupleSpace");
    	}
        monitor.unlock();
    }

    public Tuple tryTake(Tuple template) {
    	// Dans le cas o? le template est nul on renvoie une exception
    	if (template == null) {
    		throw new NullPointerException();
    	}
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
    	// Dans le cas ou le template est nul on renvoie une exception
    	if (template == null) {
    		throw new NullPointerException();
    	}
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
    	if (template == null) {
    		throw new NullPointerException();
    	}
        Collection<Tuple> collection = new ArrayList<>();
    	try {
	    	startTaking();
	        for(Tuple t : tupleSpace) {
	            if(t.matches(template)) {
	                // int indexOfTuple = tupleSpace.indexOf(t);
	                // collection.add(tupleSpace.get(indexOfTuple));
	            	collection.add(t);
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
    	if (template == null) {
    		throw new NullPointerException();
    	}
        Collection<Tuple> collection = new ArrayList<>();
    	try {
	    	startReading();
	        for(Tuple t : tupleSpace) {
	            if(t.matches(template)) {
	                // int indexOfTuple = tupleSpace.indexOf(t);
	                // collection.add(tupleSpace.get(indexOfTuple));
	            	collection.add(t);
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
			if (timing.equals(eventTiming.IMMEDIATE)) {
				if (mode.equals(eventMode.READ)) {
					Tuple t = read(template);
		    		callback.call(t);
				}
				else {
					Tuple t = take(template);
			    		callback.call(t);
				}
			} else {
				if (mode.equals(eventMode.READ)) {
					waitingReadsOfCalls.putIfAbsent(template, new ArrayBlockingQueue<>(1000000, true));
					waitingReadsOfCalls.get(template).add(callback);
				}
				else {
					waitingTakesOfCalls.putIfAbsent(template, new ArrayBlockingQueue<>(1000000, true));
					waitingTakesOfCalls.get(template).add(callback);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();	
		}
    } ).start();
}
	
} 
