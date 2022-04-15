package linda.search.concurrentServer;

import linda.*;

public class Main {

    public static void main(String args[]) {
        Linda linda = new linda.server.LindaClient("rmi://localhost:4000/MonServeur");
        
    	if (args.length < 2 || (!args[1].equals("u") && args.length%2==0)) {
            System.err.println("linda.search.concurrentServer.Main numberOfSearcher u search1 search2 ... searchk file");
            
            System.err.println("linda.search.concurrentServer.Main numberOfSearcher search1 file1 search2 file2 ... searchk filek");
            
            System.err.println("u : search all keywords from unique file");
            return;
    	}else if(args[1].equals("u")){
            linda.write(new Tuple(Code.Taille,0));
            (new Thread(new Manager(1,"rmi://localhost:4000/MonServeur", args[args.length-1], args[2]))).start();
            for(int i=3;i<args.length-1;i++){
                (new Thread(new Manager(i-1,"rmi://localhost:4000/MonServeur", args[i]))).start();
            }
        } else{
            linda.write(new Tuple(Code.Taille,0));
            for(int i=1;i<(args.length-1)/2;i++){
                (new Thread(new Manager(i,"rmi://localhost:4000/MonServeur", args[2*i+1], args[2*i]))).start();
            }
        }

        for(int i=0;i<Integer.valueOf(args[0]);i++){
            (new Thread(new Searcher(i+1,"rmi://localhost:4000/MonServeur"))).start();
        }
       
        
    }
}
