package linda.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import linda.Callback;
import linda.Tuple;

public class CallbackImpl extends UnicastRemoteObject implements CallbackItf  {

	private Callback cb;
	
	public CallbackImpl(Callback cb) throws RemoteException {
		this.cb = cb;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call(Tuple t) throws RemoteException {
		// TODO Auto-generated method stub
		this.cb.call(t);
	}

}
