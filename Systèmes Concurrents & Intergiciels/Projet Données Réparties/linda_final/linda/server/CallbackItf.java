package linda.server;

import java.rmi.RemoteException;

import linda.Callback;
import linda.Tuple;
import java.rmi.*;

public interface CallbackItf extends Remote   { 
	void call(Tuple tuple) throws RemoteException;
}
