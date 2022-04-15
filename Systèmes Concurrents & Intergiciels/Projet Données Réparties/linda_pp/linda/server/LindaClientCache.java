package linda.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

import linda.AsynchronousCallback;
import linda.Callback;
import linda.Linda;
import linda.Tuple;
import linda.Linda.eventMode;
import linda.Linda.eventTiming;

/** Client part of a client/server implementation of Linda.
 * It implements the Linda interface and propagates everything to the server it is connected to.
 * */
public class LindaClientCache implements LindaCache {
	
	
	private LindaserverCache linda;
	private ArrayList<Tuple> cache; 
	
	class takeCallback implements Callback{

		@Override
		public void call(Tuple t) {
			cache.remove(t);
			System.out.println(t+" removed from cache");
		}
	
		
	}
	
    /** Initializes the Linda implementation.
     *  @param serverURI the URI of the server, e.g. "rmi://localhost:4000/LindaServer" or "//localhost:4000/LindaServer".
     */
    public LindaClientCache(String serverURI) {
        // TO BE COMPLETED
    	try {
    		this.linda = (LindaserverCache) Naming.lookup(serverURI);
    		cache=new ArrayList<Tuple>();
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    // TO BE COMPLETED
    /** Adds a tuple t to the tuplespace. */
    public void write(Tuple t) {
    	try {
			this.linda.write(t);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /** Returns a tuple matching the template and removes it from the tuplespace.
     * Blocks if no corresponding tuple is found. */
    public Tuple take(Tuple template) {
    	Tuple t = null;
    	try {
			t = this.linda.take(template);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
    }

    /** Returns a tuple matching the template and leaves it in the tuplespace.
     * Blocks if no corresponding tuple is found. */
    public Tuple read(Tuple template) {
    	Tuple t = null;
    	if((t=readCache(template))==null) {
    	
	    	try {
				t = this.linda.read(template);
				if(t!=null) {//cette condition ne sert a rien :p
					cache.add(t);
					this.takeRegister(t, new AsynchronousCallback(new takeCallback()));
					
				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
		return t;
    }

    private Tuple readCache(Tuple template) {
		for(int i=cache.size()-1;i>=0;i--) {
			if (template.matches(cache.get(i))) {
				return cache.get(i);
			}
		}
		return null;
	}
    
    public boolean cacheContains(Tuple t) {
    	return cache.contains(t);
    }

	/** Returns a tuple matching the template and removes it from the tuplespace.
     * Returns null if none found. */
    public Tuple tryTake(Tuple template) {
    	Tuple t = null;
    	try {
			t = this.linda.tryTake(template);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
    }

    /** Returns a tuple matching the template and leaves it in the tuplespace.
     * Returns null if none found. */
    public Tuple tryRead(Tuple template) {
    	Tuple t = null;
    	if((t=readCache(template))==null) {
    	
	    	try {
				t = this.linda.tryRead(template);
				if(t!=null) {
					cache.add(t);
					//eventRegister
				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
		return t;
    }

    /** Returns all the tuples matching the template and removes them from the tuplespace.
     * Returns an empty collection if none found (never blocks).
     * Note: there is no atomicity or consistency constraints between takeAll and other methods;
     * for instance two concurrent takeAll with similar templates may split the tuples between the two results.
     */
    public Collection<Tuple> takeAll(Tuple template){
    	Collection<Tuple> ct = null;
    	try {
			ct = this.linda.takeAll(template);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ct;
    }

    /** Returns all the tuples matching the template and leaves them in the tuplespace.
     * Returns an empty collection if none found (never blocks).
     * Note: there is no atomicity or consistency constraints between readAll and other methods;
     * for instance (write([1]);write([2])) || readAll([?Integer]) may return only [2].
     */
    public Collection<Tuple> readAll(Tuple template){
    	Collection<Tuple> cr = null;
    	try {
			cr = this.linda.readAll(template);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cr;
    }


    /** Registers a callback which will be called when a tuple matching the template appears.
     * If the mode is Take, the found tuple is removed from the tuplespace.
     * The callback is fired once. It may re-register itself if necessary.
     * If timing is immediate, the callback may immediately fire if a matching tuple is already present; if timing is future, current tuples are ignored.
     * Beware: a callback should never block as the calling context may be the one of the writer (see also {@link AsynchronousCallback} class).
     * Callbacks are not ordered: if more than one may be fired, the chosen one is arbitrary.
     * Beware of loop with a READ/IMMEDIATE re-registering callback !
     *
     * @param mode read or take mode.
     * @param timing (potentially) immediate or only future firing.
     * @param template the filtering template.
     * @param callback the callback to call if a matching tuple appears.
     * @throws RemoteException 
     */
    public void eventRegister(eventMode mode, eventTiming timing, Tuple template, Callback callback) {
    	
    	try {
	    		//on crée un callback qui peut être appelé à distance par le serveur
    			CallbackSerial cb =  new CallbackSerial(new CallbackImpl(callback));
				//le serveur appel le callback du client à distance
				this.linda.eventRegister(mode, timing, template, cb);
			} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /** To debug, prints any information it wants (e.g. the tuples in tuplespace or the registered callbacks), prefixed by <code>prefix</code. */
    public void debug(String prefix) {
	try {
		this.linda.debug(prefix);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }

	@Override
	public void takeRegister(Tuple tuple, Callback callback) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			linda.takeRegister(tuple,  new CallbackSerial(new CallbackImpl(callback)));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
