package linda.server;

import java.net.InetAddress;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;

import linda.Callback;
import linda.Linda;
import linda.Linda.eventMode;
import linda.Linda.eventTiming;
import linda.Tuple;
import linda.shm.CentralizedLinda;
import linda.shm.CentralizedLindaCache;
import linda.shm.CentralizedLindaUpgrade5;
import linda.shm.CentralizedLindaUpgrade;

public class LindaserverImpl extends UnicastRemoteObject implements Lindaserver {
	
	//on utilise la version centralisée de linda
	private Linda linda;
	
	
	// Constructeur initialisant linda utilisée avec une autre déjà définie
	public LindaserverImpl(Linda linda) throws RemoteException {
		this.linda = linda;
	}
	
	// Constructeur créant un nouveau linda
	public LindaserverImpl() throws RemoteException {
		this.linda = new CentralizedLindaUpgrade(4);
	}
	
	//les méthodes définies dans cette classe permettent juste d'appeler à distance les méthodes de linda centralisée
	
	
	@Override
	public void write(Tuple t) throws RemoteException {
		// TODO Auto-generated method stub
			linda.write(t);
	}

	@Override
	public Tuple take(Tuple template) throws RemoteException {
		// TODO Auto-generated method stub
		return linda.take(template);
	}

	@Override
	public Tuple read(Tuple template) throws RemoteException {
		// TODO Auto-generated method stub		
		return linda.read(template);
	}

	@Override
	public Tuple tryTake(Tuple template) throws RemoteException {
		// TODO Auto-generated method stub
		return linda.tryTake(template);
	}

	@Override
	public Tuple tryRead(Tuple template) throws RemoteException {
		// TODO Auto-generated method stub
		return linda.tryRead(template);
	}

	@Override
	public Collection<Tuple> takeAll(Tuple template) throws RemoteException {
		// TODO Auto-generated method stub
		return linda.takeAll(template);
	}

	@Override
	public Collection<Tuple> readAll(Tuple template) throws RemoteException {
		// TODO Auto-generated method stub
		return linda.readAll(template);
	}

	@Override
	public void eventRegister(eventMode mode, eventTiming timing, Tuple template, Callback callback)
			throws RemoteException {
		// TODO Auto-generated method stub
			linda.eventRegister(mode, timing, template, callback);
	}

	@Override
	public void debug(String prefix) throws RemoteException {
		// TODO Auto-generated method stub
		linda.debug(prefix);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port; String URL;
		 try {
			 Integer I = new Integer(args[0]); port = I.intValue();
		 } catch (Exception ex) {
			 System.out.println(" Please enter: java LindaserverImpl <port>"); return;
		 }
		 try {
			 // Launching the naming service – rmiregistry – within the JVM
			 Registry registry = LocateRegistry.createRegistry(port);
			 // Create an instance of the server object
			 Lindaserver linda = new LindaserverImpl();
			 // compute the URL of the server
			 URL = "//localhost:" + port  + '/' +args[1];
			 Naming.rebind(URL, linda);
		 
		 } catch (Exception exc) {
			 System.out.println(" erreur serveur linda");
			 exc.printStackTrace();
		 }
	}

}
