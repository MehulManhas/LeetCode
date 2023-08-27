import java.util.Arrays;
import java.util.PriorityQueue;

public class AthLargestElement {

    public AthLargestElement(){}

    public int[] solve(int A, int[] B) {

        return createQueue(A, B);
    }

    public int[] createQueue(int A, int[] B){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int[] ans = new int[B.length];
        Arrays.fill(ans, -1);


        for(int i=0; i<B.length; i++){

            minHeap.add(B[i]);

            if(minHeap.size() > A){
                minHeap.poll();
            }

            if(minHeap.size() < A){
                ans[i] = -1;
            }
            else{
                ans[i] = minHeap.peek();
            }
        }

        return ans;
    }
}
