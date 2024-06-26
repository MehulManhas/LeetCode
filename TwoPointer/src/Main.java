import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//          Problem Description
//          Given a one-dimensional integer array A of size N and an integer B.
//
//          Count all distinct pairs with difference equal to B.
//
//          Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array and their absolute difference is B.

//          Problem Constraints
//          1 <= N <= 104
//
//          0 <= A[i], B <= 105

//          Input 1:
//          A = [1, 5, 3, 4, 2]
//          B = 3

//          Output 1:
//          2
//        CountPairsWithDiff cpd = new CountPairsWithDiff();
//        int[] arr = new int[]{1, 1, 1, 2, 2};
//        int diff = 0;
//
//        int[] arr1 = new int[]{1,2};
//        int diff1 = 0;
//        System.out.println(cpd.solve(arr1, diff1));


//        ArrayList<Integer> t1 = new ArrayList<>(Arrays.asList(1,1,1,2,2));
//        ArrayList<Integer> t2 = new ArrayList<>(Arrays.asList(1,1,1));
//        ArrayList<Integer> t3 = new ArrayList<>(Arrays.asList(1, 5, 7, 10));
//        int target1 = 3;
//        int target2 = 2;
//        int target3 = 8;
//        PairsWithGivenSumII pairsWithGivenSumII = new PairsWithGivenSumII(t3, target3);
//        System.out.println(pairsWithGivenSumII.solve(pairsWithGivenSumII.createMap(), pairsWithGivenSumII.createSet(), target3));

//        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5, 2, 1, 3));
//        ThreeSumZero threeSumZero = new ThreeSumZero();
//        System.out.println(threeSumZero.compute(input));

//        int[] A = new int[]{1, 4, 5, 8, 10};
//        int[] B = new int[]{6, 9, 15};
//        int[] C = new int[]{2, 3, 6, 6};
//        MinimizeTheAbsoluteDifference minimizeTheAbsoluteDifference = new MinimizeTheAbsoluteDifference();
//
//        System.out.println(minimizeTheAbsoluteDifference.solve(A, B, C));

//        int[] A = new int[]{1, 1, 1};
//        int B = 2;
//
//        PairsWithGivenSumII pairsWithGivenSumII = new PairsWithGivenSumII();
//        System.out.println(pairsWithGivenSumII.solve(A, B));


//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,-4,0,0,5,-5,1,0,-2,4,-4,1,-1,-4,3,4,-1,-1,-3));
//
//        ThreeSumZero threeSumZero = new ThreeSumZero();
//        System.out.println(threeSumZero.threeSum(A));

//        int[] A = new int[]{1,2,6,6,7,9,9};
//        int B = 13;
//        PairsWithGivenSumII pairsWithGivenSumII = new PairsWithGivenSumII();
//        System.out.println(pairsWithGivenSumII.solve(A, B));

        int[] nums = new int[]{0,0,1,0,1,0,1};
        BinarySubarraysWithSum binarySubarraysWithSum = new BinarySubarraysWithSum();
        binarySubarraysWithSum.numSubarraysWithSum(nums, 2);
    }
}