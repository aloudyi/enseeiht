package linda.search.concurrent;

import linda.*;

public class Main {

    public static void main(String args[]) {
    	if (args.length < 3) {
            System.err.println("linda.search.basic.Main search1 search2 file.");
            return;
    	}
        Linda linda = new linda.shm.CentralizedLinda();
       
        linda.write(new Tuple(Code.Taille,0));
        (new Thread(new Manager(1,linda, args[2], args[0]))).start();
        (new Thread(new Manager(2,linda, args[1]))).start();
        (new Thread(new Searcher(1,linda))).start();
        (new Thread(new Searcher(2,linda))).start();
    }
}
