import java.util.Stack;

public class MAXandMIN {

    public int[] findNearestSmallerElementLeft(int[] A){
        int n = A.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        ans[0] = -1;
        stack.push(0);
        for(int i = 1; i < n; i++){
            while(!stack.isEmpty() && A[stack.peek()] >= A[i])
                stack.pop();
            if(stack.isEmpty())
                ans[i] = -1;
            else
                ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }
    public int[] findNearestSmallerElementRight(int[] A){
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        ans[n-1] = n;
        stack.push(n-1);
        for(int i = n-2; i >= 0; i--){
            while(!stack.isEmpty() && A[stack.peek()] >= A[i])
                stack.pop();
            if(stack.isEmpty())
                ans[i] = n;
            else
                ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }
    public int[] findNearestGreaterElementLeft(int[] A){
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        ans[0] = -1;
        stack.push(0);
        for(int i = 1; i < n; i++){
            while(!stack.isEmpty() && A[stack.peek()] <= A[i])
                stack.pop();
            if(stack.isEmpty())
                ans[i] = -1;
            else
                ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }
    public int[] findNearestGreaterElementRight(int[] A){
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        ans[n-1] = n;
        stack.push(n-1);
        for(int i = n-2; i >= 0; i--){
            while(!stack.isEmpty() && A[stack.peek()] <= A[i])
                stack.pop();
            if(stack.isEmpty())
                ans[i] = n;
            else
                ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    public int solve(int[] A) {
        //need to find Nearest Smaller in left, Nearest smallest in right
        //need to find Nearest greater in left, Nearest greater in right

        int[] NearestSmallerElementLeft = findNearestSmallerElementLeft(A);
        int[] NearestSmallerElementRight = findNearestSmallerElementRight(A);
        int[] NearestGreaterElementLeft = findNearestGreaterElementLeft(A);
        int[] NearestGreaterElementRight = findNearestGreaterElementRight(A);

        int n = A.length;
        int mod = 1000000007;

        long totalMax = 0l, totalMin = 0l;

        for(int i = 0; i < n; i++){
            //number of subarrays where A[i] will be maximum
            long maxSubarrayCount = 1l * (NearestGreaterElementRight[i] - i) * (i - NearestGreaterElementLeft[i]);
            long currentMaxContri = (A[i] * maxSubarrayCount) % mod;

            //number of subarrays where A[i] will be minimum
            long minSubarrayCount = 1l * (NearestSmallerElementRight[i] - i) * (i - NearestSmallerElementLeft[i]);
            long currentMinContri = (A[i] * minSubarrayCount) % mod;

            //generating total max contribution and minimum contribution
            totalMax = ((currentMaxContri % mod) + (totalMax % mod)) % mod;
            totalMin = ((currentMinContri % mod) + (totalMin % mod)) % mod;
        }

        int sum = (int)(totalMax - totalMin) % mod;
        return (sum + mod) % mod;
    }
}
