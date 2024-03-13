import java.util.HashMap;

//https://leetcode.com/problems/min-cost-climbing-stairs/description/?envType=study-plan-v2&envId=dynamic-programming
public class MinCostClimbingStairs {
    public int minCostClimbingStairsTabulation(int[] cost) {
        int[] min = new int[cost.length+1];

        for(int i=2; i<min.length; i++){
            int takeOneStep = cost[i-1] + min[i-1];
            int takeTwoStep = cost[i-2] + min[i-2];
            min[i] = Math.min(takeOneStep, takeTwoStep);
        }

        return min[min.length-1];
    }

    public int minCostClimbingStairsMemoization(int[] cost) {
        HashMap<Integer, Integer> minValues = new HashMap<>();

        return minimumCost(minValues, cost.length, cost);
    }
    private int minimumCost(HashMap<Integer, Integer> minValues, int i, int[] cost){
        if(i<=1){
            return 0;
        }

        if(minValues.containsKey(i)){
            return minValues.get(i);
        }

        int downOne = cost[i-1] + minimumCost(minValues, i-1, cost);
        int downTwo = cost[i-2] + minimumCost(minValues, i-2, cost);

        minValues.put(i, Math.min(downOne, downTwo));

        return minValues.get(i);
    }
}
