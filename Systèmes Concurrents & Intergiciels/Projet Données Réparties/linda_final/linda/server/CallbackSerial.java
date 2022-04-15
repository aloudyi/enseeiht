package linda.server;

import java.io.Serializable;
import java.rmi.RemoteException;

import linda.Callback;
import linda.Tuple;

public class CallbackSerial implements Callback,Serializable {

	CallbackItf cb;
	
	public CallbackSerial(CallbackItf cb) {
		this.cb = cb;
	}
	@Override
	public void call(Tuple t) {
		// TODO Auto-generated method stub
		try {
			this.cb.call(t);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
