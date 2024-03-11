//https://leetcode.com/problems/fibonacci-number/description/?envType=study-plan-v2&envId=dynamic-programming
public class FibonacciNumber {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
