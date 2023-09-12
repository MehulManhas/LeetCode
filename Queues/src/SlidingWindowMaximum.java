import java.util.*;

public class SlidingWindowMaximum {

    public SlidingWindowMaximum(){

    }

    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {

        int max = Integer.MIN_VALUE;

        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Integer> numQueue = new LinkedList<>();

        for(int i=0; i<B; i++){
            max = Math.max(A.get(i), max);
            numQueue.add(A.get(i));
        }

        ans.add(0, max);

        int start = 1;
        int end = B;

        while(end < A.size() && !numQueue.isEmpty()){

            numQueue.add(A.get(end));
            int currentStartElement = numQueue.poll();

            if(currentStartElement == max && A.get(end) > max){
                max = A.get(end);
            }
            else if(currentStartElement == max && A.get(end) < max){
                int currMax = Integer.MIN_VALUE;
                for (Iterator<Integer> it = numQueue.iterator(); it.hasNext(); ) {
                    int i = it.next();
                    currMax = Math.max(currMax, i);
                }
                max = currMax;
            }
            else if(currentStartElement != max && A.get(end) > max){
                max = A.get(end);
            }

            ans.add(start, max);
            start++;
            end++;
        }

        return ans;
    }
}
