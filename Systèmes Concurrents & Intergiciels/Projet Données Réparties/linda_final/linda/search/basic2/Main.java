package linda.search.basic2;

import linda.*;

public class Main {

    public static void main(String args[]) {
    	if (args.length != 2) {
            System.err.println("linda.search.basic.Main search file.");
            return;
    	}
        Linda linda = new linda.shm.CentralizedLinda();
        Manager manager = new Manager(linda, args[1], args[0]);
        Searcher searcher = new Searcher(linda);
        (new Thread(manager)).start();
        (new Thread(searcher)).start();
    }
}
