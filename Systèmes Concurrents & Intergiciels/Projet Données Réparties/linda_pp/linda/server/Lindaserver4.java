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

public class Lindaserver4 extends UnicastRemoteObject implements Lindaserver {
	
	//on utilise la version centralis?e de linda
	private CentralizedLinda linda;
	
	private Linda linda_server;
	
	// liste des autres serveurs
	static String servers[] = {"Lindaserver1", "Lindaserver2", "Lindaserver3"};
	static int ports[] = {4000, 4001, 4002};
	
	
	// Constructeur initialisant linda utilis?e avec une autre d?j? d?finie
	public Lindaserver4(CentralizedLinda linda) throws RemoteException {
		this.linda = linda;
	}
	
	// Constructeur cr?ant un nouveau linda
	public Lindaserver4() throws RemoteException {
		this.linda = new CentralizedLinda();
	}
	
	//les m?thodes d?finies dans cette classe permettent juste d'appeler ? distance les m?thodes de linda centralis?e
	
	
	@Override
	public void write(Tuple t) throws RemoteException {
		// TODO Auto-generated method stub
			linda.write(t);
	}

	@Override
	public Tuple take(Tuple template) throws RemoteException {
		// TODO Auto-generated method stub
		int i = 0;
		Tuple tuple = null;
		tuple = linda.tryTake(template);
		while(tuple == null) {
			this.linda_server = new linda.server.LindaClient("//localhost:" + ports[i]  + '/' +servers[i]);
			tuple = linda_server.tryTake(template);
			i = (i+1)%4;
		}
		return tuple;
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
			 // Launching the naming service ? rmiregistry ? within the JVM
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
