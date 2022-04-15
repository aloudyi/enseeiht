package linda.server;

import java.util.Collection;

import linda.Callback;
import linda.Linda;
import linda.Tuple;

/** Public interface to a Linda implementation.
 * @author philippe.queinnec@enseeiht.fr
 */
public interface LindaCache extends Linda {


    /** Registers a callback which will be called when the tuple "tuple" was taken.
     
     * @param tuple the tuple which we are monitoring if it has been taken.
     * @param callback the callback to call so that the client removes the tuple from its cache.
     */
    public void takeRegister( Tuple tuple, Callback callback) throws java.rmi.RemoteException;

}
