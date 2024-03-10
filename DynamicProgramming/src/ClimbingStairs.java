import java.util.Arrays;

public class ClimbingStairs {
    int stairs;

    int[] DpArr;
    public ClimbingStairs(){}

    public void createDpArr(int stairs){
        this.stairs = stairs;
        this.DpArr = new int[stairs+1];

        Arrays.fill(DpArr, -1);

        System.out.println(calculateThroughMemoization(stairs, DpArr));
    }

    public int calculateThroughMemoization(int Idx, int[] dpArr){

        if(Idx < 0){
            return 0;
        }

        if(Idx == 0 || Idx == 1){
            DpArr[Idx] = 1;
            return DpArr[Idx];
        }

        if(this.DpArr[Idx] == -1){
            DpArr[Idx] = calculateThroughMemoization(Idx-1, dpArr) + calculateThroughMemoization(Idx-2, dpArr);
        }
        return DpArr[Idx];
    }

    public int climbStairsThroughDp(int n) {
        if(n==1){
            return 1;
        }

        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
