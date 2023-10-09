import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSides {
    public int solve(ArrayList<Integer> A, int B) {
        return findMaxSumPossible(A, B);
    }

    public int findMaxSumPossible(ArrayList<Integer> A, int B){
        int leftPtr = B-1;
        int rightPtr = A.size()-1;
        int maxSum = Integer.MIN_VALUE;

        int initialSum = 0;

        for(int i=0; i<B; i++){
            initialSum += A.get(i);
        }

        maxSum = initialSum;

        while(leftPtr >= 0 && rightPtr >= A.size() - B){
            initialSum -= A.get(leftPtr);
            initialSum += A.get(rightPtr);
            leftPtr--;
            rightPtr--;

            maxSum = Math.max(maxSum, initialSum);
        }

        return maxSum;
    }
}
