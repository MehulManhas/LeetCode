import java.util.PriorityQueue;

public class KPlacesApart {
    public KPlacesApart(){}

    public int[] solve(int[] A, int B) {

        PriorityQueue<Integer> ans = createQueue(A);
        return computeAndUpdateArr(ans, A);

    }

    public PriorityQueue<Integer> createQueue(int[] A){

        PriorityQueue<Integer> ans = new PriorityQueue<>();

        for(int i : A){
            ans.add(i);
        }

        return ans;
    }

    public int[] computeAndUpdateArr(PriorityQueue<Integer> ans, int[] A){

        int itr = 0;

        while(!ans.isEmpty()){
            A[itr] = ans.poll();
            itr++;
        }

        return A;
    }

}
