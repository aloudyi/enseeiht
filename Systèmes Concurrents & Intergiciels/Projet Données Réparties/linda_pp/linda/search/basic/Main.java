package linda.search.basic;

import linda.*;

public class Main {

    public static void main(String args[]) {
    	if (args.length != 2) {
            System.err.println("linda.search.basic.Main search file.");
            return;
    	}
        //Linda linda = new linda.shm.CentralizedLinda();
    	Linda linda = new linda.server.LindaClient("//localhost:4000/MonServeur");
        Manager manager = new Manager(linda, args[1], args[0]);
        Manager manager2 = new Manager(linda, args[1], "banana");

        Searcher searcher = new Searcher(linda,1);
        Searcher searcher2 = new Searcher(linda,2);

        (new Thread(manager)).start();
        (new Thread(manager2)).start();

        (new Thread(searcher)).start();
        (new Thread(searcher2)).start();


    }
}
