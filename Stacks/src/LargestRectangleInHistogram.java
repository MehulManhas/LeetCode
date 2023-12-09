import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] A) {
        int[] lessThanLeft = calculateLessThanLeft(A);
        int[] lessThanRight = calculateLessThanRight(A);
        int ans = 0;
        //2, 8, 7, 6, 9, 7, 1
        for(int i=0; i<A.length; i++){
            int leftStop = lessThanLeft[i];
            int rightStop = lessThanRight[i];

            ans = Math.max((rightStop - leftStop -1) * A[i], ans);
        }
        return ans;
    }
    public int[] calculateLessThanLeft(int[] A){
        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[A.length];
        Arrays.fill(ans, -1);

        for(int i=0; i<A.length; i++){
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i] = stack.peek();
            }
            stack.push(i);
            // l-r -1 -1 1 2 1 4
        }
        return ans;
    }
    public int[] calculateLessThanRight(int[] A){
        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[A.length];
        Arrays.fill(ans, A.length);

        for(int i=A.length-1; i>=0; i--){
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i] = stack.peek();
            }
            stack.push(i);
            //r-l: 1 -1 4 4 4 -1 -1
        }
        return ans;
    }
}
