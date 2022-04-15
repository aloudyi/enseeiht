package linda.server;

import java.util.Collection;

import linda.AsynchronousCallback;
import linda.Callback;
import linda.Tuple;
import linda.Linda.eventMode;
import linda.Linda.eventTiming;

public interface LindaserverCache extends Lindaserver {
	
	

    /** Registers a callback which will be called when the tuple "tuple" was taken.
     
     * @param tuple the tuple which we are monitoring if it has been taken.
     * @param callback the callback to call so that the client removes the tuple from its cache.
     */
    public void takeRegister( Tuple tuple, Callback callback) throws java.rmi.RemoteException;


}
