package linda.shm;
import linda.Callback;
import linda.Linda;
import linda.Tuple;
import linda.server.CallbackItf;
import linda.Linda.eventMode;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
/** Shared memory implementation of Linda. */
public class CentralizedLindaUpgrade3 implements Linda {
	// L'espace des Tuples qu'on va manipuler
    private HashMap<Integer,Tuple> tupleSpace;
    // Mon moniteur
    private ReentrantLock monitor;
    // condition lecture (read)
    private Condition readPossible;
    // condition prise (take)
    private Condition takePossible;
    // condition Ã©criture (write)
    private Condition writePossible;   
	private Condition incrementHashPossible;
    // ecriture en cours ?
   	// private boolean currentlyWriting;
    private int currentlyWriting;    
    // prise en cours ?
    //private boolean currentlyTaking; 
    private int currentlyTaking;
    private List<Tuple> beingTaken; // liste des tuples en cours de suppression de l'espace des tuples, utilis�e pour pouvoir executer des take simultanement
    // nombre de lecteurs en cours
    private int currentReaders;
    // nombre de lecteurs en attente
    private int waitingReaders;
    // nombre d'Ã©crivains en attente
    private int waitingWriters;
    // Les Reads bloqu�s selon les templates correspondant
    private HashMap<Tuple, BlockingQueue<Condition>> waitingReads  = new HashMap<>();
    // Les Takes bloqu�s selon les templates correspondant
	private HashMap<Tuple, BlockingQueue<Condition>> waitingTakes  = new HashMap<>();
	// Les Reads bloqu�s dans les calls 
	private HashMap<Tuple, BlockingQueue<Callback>> waitingReadsOfCalls  = new HashMap<>();
	// Les Takes bloqu�s dans les calls
	private HashMap<Tuple, BlockingQueue<Callback>> waitingTakesOfCalls  = new HashMap<>();
	private int n;
	private int allThreadsFinished = 0;
	private int indexOfTuple = -1;
	private int hashMapIndex = -1;
    public CentralizedLindaUpgrade3(int n) {
		this.n = n;
        monitor = new ReentrantLock();
        readPossible = monitor.newCondition();
        takePossible = monitor.newCondition();
        writePossible = monitor.newCondition();
		incrementHashPossible = monitor.newCondition(); // New for parallel takes
        currentlyTaking = 0;
        currentlyWriting = 0;
        currentReaders = 0;
        waitingReaders = 0;
        waitingWriters = 0;
        beingTaken =  new ArrayList<>();
        tupleSpace = new HashMap<Integer,Tuple>();

    }

    // Demande Lecture
    private void startReading() throws InterruptedException {

        monitor.lock();       
        while(currentlyWriting>0 || currentlyTaking>0) {
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
     
    private boolean contient( List<Tuple> beingTaken, Tuple motif) {
    	boolean res = false;
    	for(Tuple t: beingTaken) {
    		if (t.matches(motif)) {
    			res = true;
    			break;
    		}
    	}
    	return res;
    }

    // Demander Prise
    private void startTaking(Tuple motif) throws InterruptedException {
        monitor.lock();
        									
        while(currentlyWriting>0 || contient(beingTaken, motif) || currentReaders != 0 || waitingReaders > 0 || waitingWriters > 0 || currentlyTaking>this.n) {
            takePossible.await();
        }
        beingTaken.add(motif); 
        currentlyTaking++;
        takePossible.signal();

        monitor.unlock();
    }

    // Terminer Prise
    private void finishTaking(Tuple motif) throws InterruptedException {        
        
        monitor.lock();
        currentlyTaking--;
        beingTaken.remove(motif);  
        if(currentlyTaking == 0) {
            if(waitingReaders > 0) {
            	readPossible.signal();
            } else {
                writePossible.signal();
            }
        }
        monitor.unlock();

    }

    // Demander Prise
    private void startWriting() throws InterruptedException {

        monitor.lock();
    	while( currentlyTaking>0 || currentReaders != 0 || waitingReaders > 0) {
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
    	monitor.lock();
        try {
            startWriting();
            // On ajoute le tuple au TupleSpace
			// /!\ HELP
			// Lock this operation mutex ?
			this.hashMapIndex++;
			int index = this.hashMapIndex;
            tupleSpace.put(index,t.deepclone());
			// unmutex Here
            // PRIORITE AUX READS EN ATTENTE
            // On signale les reads en attente
        	for(Tuple template : waitingReads.keySet()){ // On parcours tous les templates de waitingRead pour v�rifier l'existence du notre
    			if(t.matches(template)){
    				// On signale toutes les conditions li�es au template donn�
    				for (Condition c : waitingReads.get(template)) {
    					c.signal();
    					// On supprime la condition de la liste apr�s l'avoir signal�
    					waitingReads.get(template).remove(c);
    				}
    			}
    		}
        	
        	// GESTION DES READS PROVENANT DES CALLBACK FUTURE
        	for(Tuple template : waitingReadsOfCalls.keySet()){ // On parcours tous les templates de waitingReadsOfCalls pour v�rifier l'existence du notre
    			if(t.matches(template)){
    				// On call tous les callbacks li�s au template donn� 
    				for(Callback call : waitingReadsOfCalls.get(template)){
    					new Thread(() -> {
    						Tuple te = read(t);
    			    		call.call(te);
    					}).start();
    					// On supprime le callback apr�s l'avoir call�
    					waitingReadsOfCalls.get(template).remove(call);
    				}
    			}
    		}
        	
        	// GESTION DES TAKES 
        	for(Tuple template : waitingTakes.keySet()){ // On parcours tous les templates de waitingRead pour v�rifier l'existence du notre
    			if(t.matches(template)){
    				// On signale toutes les conditions li�es au template donn�
    				for (Condition c : waitingTakes.get(template)) {
    					c.signal();
    					// On supprime la condition du tableau apr�s l'avoir signal�
    					waitingTakes.get(template).remove(c);
    				}
    			}
    		}
        	
        	// GESTION DES TAKES PROVENANT DES CALLBACK FUTURE
        	for(Tuple template : waitingTakesOfCalls.keySet()){ // On parcours tous les templates de waitingReadsOfCalls pour v�rifier l'existence du notre
    			if(t.matches(template)){
    				// On call tous les callbacks li�s au template donn� 
    				for(Callback call : waitingTakesOfCalls.get(template)){
    					new Thread(() -> {
    						Tuple te = take(t);
    			    		call.call(te);
    					}).start();
    					// On supprime le callback apr�s l'avoir call�
    					waitingTakesOfCalls.get(template).remove(call);
    				}
    			}
    		}
     
            finishWriting();
            
        } catch (InterruptedException e) {
            debug("khratWrite");
        }
        monitor.unlock();
    }

    /** Returns a tuple matching the template and removes it from the tuplespace.
     * Blocks if no corresponding tuple is found. */
    public Tuple take(Tuple template) {
    	Tuple tuple = null;
		monitor.lock();
		// Boucle qui breakera dans le cas o� on trouvera le tuple correspondant ult�rieurement apr�s un Write
		while (true) {
			// Version non bloquante de take qui sera utile pour savoir si on n'a pas trouv� le template donn�
			tuple = tryTake(template);
			//System.out.println("debug take "+tuple);
			if (tuple == null) {
				// On cr�e une condition qui sera signal�e en cas d'�criture d'un motif qui match le motif en attente de lecture
				Condition c = monitor.newCondition();
				// Si le template n'est pas pr�sent dans la HashMap, on le cr�e et on lui associe une liste de conditions qui l'attendent
				waitingTakes.putIfAbsent(template, new ArrayBlockingQueue<>(1000000, true));
				// On ajoute la condition � la liste de conditions du template donn�
		    	waitingTakes.get(template).add(c);
		    	try {
		    		// On wait la condition en attente du signal qui proviendra du write
		    		c.await();
		    	}
		    	catch (InterruptedException e) {
		    		System.out.println("Khrat Read");
		    	}
			} else {
				break;
			}
		}
		monitor.unlock();
		return tuple;
    }

    /** Returns a tuple matching the template and leaves it in the tuplespace.
     * Blocks if no corresponding tuple is found. */
    public Tuple read(Tuple template) {
    	Condition c;
    	Tuple tuple = null;
		monitor.lock();
		// Boucle qui breakera dans le cas o� on trouvera le tuple correspondant ult�rieurement apr�s un Write
		while (true) {
			// Version non bloquante de Read qui sera utile pour savoir si on n'a pas trouv� le template donn�
			tuple = tryRead(template);
			//System.out.println("debug read "+tuple);
			if (tuple == null) {
				// On cr�e une condition qui sera signal�e en cas d'�criture d'un motif qui match le motif en attente de lecture
				c = monitor.newCondition();
				// Si le template n'est pas pr�sent dans la HashMap, on le cr�e et on lui associe une liste de conditions qui l'attendent
				waitingReads.putIfAbsent(template, new ArrayBlockingQueue<>(1000000, true));
				// On ajoute la condition � la liste de conditions du template donn�
		    	waitingReads.get(template).add(c);
		    	try {
		    		// On wait la condition en attente du signal qui proviendra du write
		    		c.await();
		    	}
		    	catch (InterruptedException e) {
		    		System.out.println("Khrat Read");
		    	}
			} else {
				break;
			}
		}
		monitor.unlock();
		return tuple;
    }

    public void debug(String prefix) {
    	monitor.lock();
       tupleSpace.forEach((key,value)-> { 
    	System.out.println(value);});
       System.out.println("******************************************************** " + prefix);
       monitor.unlock();
    }

    public Tuple tryTake(Tuple template) {
    	// Dans le cas o� le template est nul on renvoie une exception
    	if (template == null) {
    		throw new NullPointerException();
    	}
    	Tuple tuple = null;
        int indexOfTemplate = -1;
        try {
            startTaking(template);
            indexOfTemplate = indexOfTemplate(tupleSpace, template);
            if(indexOfTemplate != -1) {
            	tuple = tupleSpace.remove(indexOfTemplate);
            	while(tuple==null) {
                    indexOfTemplate = indexOfTemplate(tupleSpace, template);
                    if(indexOfTemplate != -1) {
                    	tuple = tupleSpace.remove(indexOfTemplate);
                    }
            	}
            }
            finishTaking(template);
        } catch ( InterruptedException e) {
            debug("khratTryTake");
        }
      //  System.out.print("index "+(indexOfTemplate)+" ");
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
            	while(tuple==null) {
                    indexOfTemplate = indexOfTemplate(tupleSpace, template);
                    if(indexOfTemplate != -1) {
                    	tuple = tupleSpace.get(indexOfTemplate);
                    }
            	}
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
      	List<Integer> keys = new ArrayList<>();
    	try {
	    	startTaking(template);
	        tupleSpace.forEach((key,t) -> {
	            if(t.matches(template)) {
	                // int indexOfTuple = tupleSpace.indexOf(t);
	                // collection.add(tupleSpace.get(indexOfTuple));
	            	collection.add(t);
			//		tupleSpace.remove(key);
				}
	        });
	        for(int key : keys) {
	        	tupleSpace.remove(key);
	        }
			finishTaking(template);
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
	        tupleSpace.forEach((key,t)-> {
	            if(t.matches(template)) {
	                // int indexOfTuple = tupleSpace.indexOf(t);
	                // collection.add(tupleSpace.get(indexOfTuple));
	            	collection.add(t);
	            }
	        });
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
    public int indexOfTemplate(HashMap<Integer,Tuple> tupleSpace, Tuple template) {
		int nbThreads = this.n;
		int batchSize0 = tupleSpace.size();
		if(n!=1) {
			batchSize0 = (int) Math.floor(batchSize0/(n-1)); // Sous-division de l'espace des tuples
		}
		final int batchSize = batchSize0;
		Set<Integer> keys = tupleSpace.keySet();
		List<Integer> keyList = new ArrayList<Integer>();
		for(Integer key : keys) {
			keyList.add(key);
		}
		this.allThreadsFinished = 0;
			// Thread qui gère le reste :
			// Un thread s'occupe alors de parcourir cette partie de l'espace
		List<List<Integer>> batchKeys = new ArrayList<List<Integer>>();
		List<Integer> offsets1 = new ArrayList<Integer>();		
		
		int offset0 = batchSize*(nbThreads-1);
		int offset1 = tupleSpace.size();
		batchKeys.add(keyList.subList(offset0,offset1));
		for(int i =1; i<nbThreads; i++){
			offset0 = batchSize*(i-1);
			offset1 = batchSize*i;
			batchKeys.add(keyList.subList(offset0,offset1));

		}
			
		for(int i =0; i<nbThreads; i++){
				// Un thread s'occupe alors de parcourir cette partie de l'espace
				final int j = i;
				new Thread() {
					int result = -1;
					public void run() {
						HashMap<Integer,Tuple> tupleBatch = new HashMap<Integer,Tuple>();
						for (Integer key: batchKeys.get(j)) {
							//System.out.println("khrat 1");
							Tuple value = tupleSpace.get(key);
							if (value != null) tupleBatch.put(key, value);
							//System.out.println("khrat 2");
						}
						if(indexOfTuple==-1){
							//System.out.println("khrat 3");
							result = indexOfTemplateElementary(tupleBatch,template);
							if(result!=-1){
								//System.out.println("khrat 4");								
								indexOfTuple = result;
								result = -1;
							}
						}
						allThreadsFinished++; // On incrémente un compteur
						//System.out.println("thread "+j+", khrat 5");						
					}
				}.start();
				//System.out.println("khrat 5.5");
				//	System.out.println("FINAL i "+i);
				//	System.out.println("nbThreads "+nbThreads);
				//System.out.println("finishedThreads "+allThreadsFinished);
				//System.out.println("khrat 6");

		}
		//System.out.println("khrat 7");

		// Tant que l'indice n'est pas trouvé ET qu'on n'a pas parcouru toutes les sous-divisions on attend
		while((indexOfTuple==-1) && (allThreadsFinished<nbThreads)){
				// wait
		}
		//System.out.println("khrat 8");

		int output = indexOfTuple;
		indexOfTuple = -1;
		return output;
    }

	// Renvoie l'indice
	public int indexOfTemplateElementary(HashMap<Integer,Tuple> tupleSpace, Tuple template){
		List<Boolean> finished = new ArrayList<Boolean>();
		finished.add(true);
		List<Integer> indexOfTemplate = new ArrayList<Integer>();
		tupleSpace.forEach((key,value)->{
			if(value.matches(template)&&(finished.get(finished.size()-1))) {
				indexOfTemplate.add(key);
				finished.add(false);
			}
		});
		int output = -1;
		if(!(indexOfTemplate.isEmpty())) {
			output = indexOfTemplate.get(0);
		}
		return output;
	}
    
   /* public int indexOfTemplateElementary(HashMap<Integer,Tuple> tupleSpace, Tuple template){
        //List<Boolean> finished = new ArrayList<Boolean>();
        //finished.add(true);
        //List<Integer> indexOfTemplate = new ArrayList<Integer>();
        
        for(Integer key : tupleSpace.keySet()) {
            Tuple value=tupleSpace.get(key);
            if(value.matches(template))//&&(finished.get(finished.size()-1))) {
                

                System.out.println("found "+key);
                return key;
            }
        }
        
        tupleSpace.forEach((key,value)->{
            if(value.matches(template)&&(finished.get(finished.size()-1))) {
                indexOfTemplate.add(key);
                finished.add(false);
            }
        });
        int output = -1;
        if(!(indexOfTemplate.isEmpty())) {
            output = indexOfTemplate.get(0);
        }
        return output;
        System.out.println("not found ");
        return -1;
    } */    
    
    
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