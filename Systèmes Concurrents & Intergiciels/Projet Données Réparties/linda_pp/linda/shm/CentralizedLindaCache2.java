package linda.shm;

import linda.Callback;

import linda.Linda;
import linda.Tuple;
import linda.server.CallbackItf;
import linda.server.LindaCache;
import linda.Linda.eventMode;

import java.rmi.RemoteException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
/** Shared memory implementation of Linda. */
public class CentralizedLindaCache2 implements LindaCache {
	// L'espace des Tuples qu'on va manipuler
    private List<Tuple> tupleSpace;
    // Mon moniteur
    private ReentrantLock monitor;
    // condition lecture (read)
    private Condition readPossible;
    // condition prise (take)
    private Condition takePossible;
    // condition ÃƒÂ©criture (write)
    private Condition writePossible;
  //La liste des callback à appeler pour un tuple
    private HashMap<Tuple,List<Callback>> takeCB; 
    
    
    // ecriture en cours ?
   // private boolean currentlyWriting;
    private int currentlyWriting;
    
    
    
    
    // prise en cours ?
    //private boolean currentlyTaking; 
    private boolean currentlyTaking;
   
    
    
    // nombre de lecteurs en cours
    private int currentReaders;
    // nombre de lecteurs en attente
    private int waitingReaders;
    // nombre d'ÃƒÂ©crivains en attente
    private int waitingWriters;
    // Les Reads bloqués selon les templates correspondant
    private HashMap<Tuple, BlockingQueue<Condition>> waitingReads  = new HashMap<>();
    // Les Takes bloqués selon les templates correspondant
    private HashMap<Tuple, BlockingQueue<Condition>> waitingTakes  = new HashMap<>();
    // Les Reads bloqués dans les calls 
    private HashMap<Tuple, BlockingQueue<Callback>> waitingReadsOfCalls  = new HashMap<>();
    // Les Takes bloqués dans les calls
    private HashMap<Tuple, BlockingQueue<Callback>> waitingTakesOfCalls  = new HashMap<>();
    // nombre de thread pour le parcours parallele de l'espace des tuples 	
    private int n;
    
    // indexOfTemplate volatilisé
    public volatile int indexOfTuple = -1;
    public CentralizedLindaCache2(int n ) {

        monitor = new ReentrantLock();
        readPossible = monitor.newCondition();
        takePossible = monitor.newCondition();
        writePossible = monitor.newCondition();
        currentlyTaking = false;
        currentlyWriting = 0;
        currentReaders = 0;
        waitingReaders = 0;
        waitingWriters = 0;
        tupleSpace = new ArrayList<>();
	this.n = n;
        takeCB=new HashMap<Tuple,List<Callback>>();

    }

    // Demande Lecture
    private void startReading() throws InterruptedException {

        monitor.lock();       
        while(currentlyWriting>0 || currentlyTaking) {
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
	while(currentlyWriting>0 || currentlyTaking || currentReaders != 0 || waitingReaders > 0 || waitingWriters > 0) {
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
        while(currentlyTaking || currentReaders != 0 || waitingReaders > 0) {
            waitingWriters++;
            writePossible.await();
            waitingWriters--;
        }
        currentlyWriting++;
        writePossible.signal();
        monitor.unlock();
    
    }

     // Terminer Prise
    private void finishWriting() throws InterruptedException {

        monitor.lock();
        currentlyWriting--;
        if(currentlyWriting == 0) {
            if(waitingReaders > 0) {
            	readPossible.signal();
            } else {
                takePossible.signal();
            }
        }
        monitor.unlock();

    }

    /** Adds a tuple t to the tuplespace. */
    public void write(Tuple t) {
    	if (t == null) {
    		throw new NullPointerException();
    	}
        try {
            startWriting();
           
            // On ajoute le tuple au TupleSpace
            tupleSpace.add(t.deepclone());
            
            // PRIORITE AUX READS EN ATTENTE
            // On signale les reads en attente
        	for(Tuple template : waitingReads.keySet()){ // On parcours tous les templates de waitingRead pour vérifier l'existence du notre
    			if(t.matches(template)){
    				// On signale toutes les conditions liées au template donné
    				for (Condition c : waitingReads.get(template)) {
					monitor.lock();
    					c.signal();
					monitor.unlock();
    					// On supprime la condition de la liste après l'avoir signalé
    					waitingReads.get(template).remove(c);
    				}
    			}
    		}
        	
        	// GESTION DES READS PROVENANT DES CALLBACK FUTURE
        	for(Tuple template : waitingReadsOfCalls.keySet()){ // On parcours tous les templates de waitingReadsOfCalls pour vérifier l'existence du notre
    			if(t.matches(template)){
    				// On call tous les callbacks liés au template donné 
    				for(Callback call : waitingReadsOfCalls.get(template)){
    					new Thread(() -> {
    						Tuple te = read(t);
    			    		call.call(te);
    					}).start();
    					// On supprime le callback après l'avoir callé
    					waitingReadsOfCalls.get(template).remove(call);
    				}
    			}
    		}
        	
        	// GESTION DES TAKES 
        	for(Tuple template : waitingTakes.keySet()){ // On parcours tous les templates de waitingRead pour vérifier l'existence du notre
    			if(t.matches(template)){
    				// On signale toutes les conditions liées au template donné
    				for (Condition c : waitingTakes.get(template)) {
					monitor.lock();
    					c.signal();
					monitor.unlock();
    					// On supprime la condition du tableau après l'avoir signalé
    					waitingTakes.get(template).remove(c);
    				}
    			}
    		}
        	
        	// GESTION DES TAKES PROVENANT DES CALLBACK FUTURE
        	for(Tuple template : waitingTakesOfCalls.keySet()){ // On parcours tous les templates de waitingReadsOfCalls pour vérifier l'existence du notre
    			if(t.matches(template)){
    				// On call tous les callbacks liés au template donné 
    				for(Callback call : waitingTakesOfCalls.get(template)){
    					new Thread(() -> {
    						Tuple te = take(t);
    			    		call.call(te);
    					}).start();
    					// On supprime le callback après l'avoir callé
    					waitingTakesOfCalls.get(template).remove(call);
    				}
    			}
    		}
     
            finishWriting();
            
        } catch (InterruptedException e) {
            debug("khratWrite");
        }
        
    }

    /** Returns a tuple matching the template and removes it from the tuplespace.
     * Blocks if no corresponding tuple is found. */
    public Tuple take(Tuple template) {
    	Tuple tuple = null;
		
	
		// Boucle qui breakera dans le cas où on trouvera le tuple correspondant ultérieurement après un Write
		while (true) {
			// Version non bloquante de take qui sera utile pour savoir si on n'a pas trouvé le template donné
			tuple = tryTake(template);
			if (tuple == null) {
				// On crée une condition qui sera signalée en cas d'écriture d'un motif qui match le motif en attente de lecture
				Condition c = monitor.newCondition();
				// Si le template n'est pas présent dans la HashMap, on le crée et on lui associe une liste de conditions qui l'attendent
				waitingTakes.putIfAbsent(template, new ArrayBlockingQueue<>(1000000, true));
				// On ajoute la condition à la liste de conditions du template donné
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
		
		return tuple;
    }

    /** Returns a tuple matching the template and leaves it in the tuplespace.
     * Blocks if no corresponding tuple is found. */
    public Tuple read(Tuple template) {
    	Condition c;
    	Tuple tuple = null;
		
		// Boucle qui breakera dans le cas où on trouvera le tuple correspondant ultérieurement après un Write
		while (true) {
			// Version non bloquante de Read qui sera utile pour savoir si on n'a pas trouvé le template donné
			tuple = tryRead(template);
			if (tuple == null) {
				// On crée une condition qui sera signalée en cas d'écriture d'un motif qui match le motif en attente de lecture
				c = monitor.newCondition();
				// Si le template n'est pas présent dans la HashMap, on le crée et on lui associe une liste de conditions qui l'attendent
				waitingReads.putIfAbsent(template, new ArrayBlockingQueue<>(1000000, true));
				// On ajoute la condition à la liste de conditions du template donné
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
		
		return tuple;
    }

    public void debug(String prefix) {
    	monitor.lock();
       for (Tuple t : tupleSpace) { 
    	System.out.println(t);}
       System.out.println("******************************************************** " + prefix);
       monitor.unlock();
    }

    public Tuple tryTake(Tuple template) {
    	// Dans le cas où le template est nul on renvoie une exception
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
    	        if(takeCB.get(tuple)!=null) {
    				
    				for(Callback cb : takeCB.get(tuple)) {
    					
    					cb.call(tuple);
    				}
    			}
    			takeCB.remove(tuple);
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
        	this.indexOfTuple = -1;
		int nbThreads = this.n;
		int batchSize = (int) Math.floor(tupleSpace.size()/(n-1)); // Sous-division de l'espace des tuples
		int allThreadsFinished = 0;
	     	// Thread qui gère le reste :
		// Un thread s'occupe alors de parcourir cette partie de l'espace
		new Thread() {
			int result = -1;
			int offset0 = batchSize*(nbThreads-1);
			int offset1 = tupleSpace.size();
			// On crée la sous-division i
		 	List<Tuple> tupleBatch = tupleSpace.subList(offset0,offset1);
			public void run() {
				if(this.indexOfTuple==-1){
					result = indexOfTemplateElementary(tupleBatch,template);
					if(result!=-1){
						this.indexOfTuple = result+offset0;
						result = -1;
					}
				}
				allThreadsFinished++; // On incrémente un compteur
			}
		}.start();
	    
		for(int i =1; i<nbThreads; i++){
			// Un thread s'occupe alors de parcourir cette partie de l'espace
			new Thread() {
				int result = -1;
				int offset0 = batchSize*(i-1);
				int offset1 = batchSize*i;
				// On crée la sous-division i
				List<Tuple> tupleBatch = tupleSpace.subList(offset0,offset1);
				public void run() {
					if(indexOfTuple==-1){
						result = indexOfTemplateElementary(tupleBatch,template);
						if(result!=-1){
							this.indexOfTuple = result+offset0;
							result = -1;
						}
					}
					allThreadsFinished++; // On incrémente un compteur
				}
			}.start();
		}
		// Tant que l'indice n'est pas trouvé ET qu'on n'a pas parcouru toutes les sous-divisions on attend
		while((this.indexOfTuple==-1) && (allThreadsFinished!=nbThreads)){
			// wait
		}
        return this.indexOfTuple;
    }

	// Renvoie l'indice
	public int indexOfTemplateElementary(List<Tuple> tupleSpace, Tuple template){
		int indexOfTemplate = -1;
		for(Tuple t : tupleSpace) {
			if(t.matches(template)) {
				indexOfTemplate = tupleSpace.indexOf(t);
				break;
			}
		}
		return indexOfTemplate;
	}

    
    @Override
	public void takeRegister(Tuple tuple, Callback callback) throws RemoteException {
		// TODO Auto-generated method stub
    	
		//monitor.lock();
    	
		takeCB.putIfAbsent(tuple, new ArrayList<Callback>());
		takeCB.get(tuple).add(callback);
		
		//monitor.unlock();
	}
    
    
    
	@Override
    public void eventRegister(eventMode mode, eventTiming timing, Tuple template, Callback callback) {
		new Thread(() -> {
			try {
			if (timing.equals(eventTiming.IMMEDIATE)) {
				if (mode.equals(eventMode.READ)) {
					Tuple t = read(template);
		    		callback.call(t);
				}
				else {
					Tuple t = take(template);
					//new Thread(() -> {
			    		callback.call(t);
					//}).start();
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
