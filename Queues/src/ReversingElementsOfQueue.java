import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ReversingElementsOfQueue {

    public ReversingElementsOfQueue(){}

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        //[1, 2, 3, 4, 5]
        if(B == 0){
            return A;
        }

        Queue<Integer> mainQueue = new LinkedList<>(); //4, 5
        Queue<Integer> auxQueue = new LinkedList<>(); //1, 2, 3

        for(int i=B-1; i>=0; i--){
            auxQueue.add(A.get(i));
        }

        for(int i=B; i<A.size(); i++){
            mainQueue.add(A.get(i));
        }

        while(!mainQueue.isEmpty()){
            auxQueue.add(mainQueue.poll());
        }

        A.clear();
        while(!auxQueue.isEmpty()){
            A.add(auxQueue.poll());
        }

        return A;
    }
}
