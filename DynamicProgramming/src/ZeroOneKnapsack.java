import java.util.Arrays;

public class ZeroOneKnapsack {
    int[][] dpArr;
    public int solve(int[] A, int[] B, int C) {

        dpArr = new int[A.length+1][C+1];

        for(int[] row : dpArr){
            Arrays.fill(row,-1);
        }

        return knapSack(A, B, A.length, C);
    }

    public int knapSack(int[] A, int[] B, int index, int capacity){

        if(index == 0 || capacity == 0){
            return 0;
        }

        if(dpArr[index][capacity] != -1){
            return dpArr[index][capacity];
        }

        if(B[index-1] <= capacity){
            dpArr[index][capacity] = Math.max(A[index-1] + knapSack(A, B, index-1, capacity-B[index-1]), knapSack(A, B, index-1, capacity));
        }
        else {
            dpArr[index][capacity] = knapSack(A, B, index - 1, capacity);
        }

        return dpArr[index][capacity];
    }
}
