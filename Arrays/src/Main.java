import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Checksum;

public class Main {
    public static void main(String[] args) {
//        ConvertAnArrayIntoA2DArrayWithConditions convertAnArrayIntoA2DArrayWithConditions = new ConvertAnArrayIntoA2DArrayWithConditions();
//        int[] input = new int[]{1,3,4,1,2,3,1};
//        int[] input1 = new int[]{1,2,3,4};
//        System.out.println(convertAnArrayIntoA2DArrayWithConditions.findMatrix(input));

//        int[] arr = new int[]{1,2,0};
//        int[] arr1 = new int[]{3,4,-1,1};
//        int[] arr3 = new int[]{7,8,9,11,12};
//        int[] arr4 = new int[]{-1020, -21, 2323, -234,-321, 321, -1, -780, -15, 14567,1324, 123565, 1235669,2, 4, 6, 1, 10, 60, 90, -10, -10, -20, -21, -18, 0, 45, 1};
//        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
//        firstMissingPositive.calculateFirstMissing(arr4);

//        int[] a = new int[]{1, 2, 5, -7, 2, 3};
//        MaxNonNegativeSubArray maxNonNegativeSubArray = new MaxNonNegativeSubArray();
//        System.out.println(maxNonNegativeSubArray.maxset(a));

//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,5,6,8,6,1,2,4,5));
//        AddOneToNumber addOneToNumber = new AddOneToNumber();
//
//        A = addOneToNumber.plusOne(A);
//
//        for(int i : A){
//            System.out.println(i);
//        }
//        int[] A = new int[]{1, 2, 5, -7, 2, 3};
//        int[] B = new int[]{1967513926,1540383426,-1303455736,-521595368};
//
//        MaxNonNegativeSubArray maxNonNegativeSubArray = new MaxNonNegativeSubArray();
//        int[] ans = maxNonNegativeSubArray.maxset(B);
//
//        for(int i : ans){
//            System.out.print(i);
//        }

//        int[] A = new int[]{1,2};
//        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
//        System.out.println(bestTimeToBuyAndSellStock.maxProfit(A));

//        int[] A = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        MaxSumContiguousSubarray maxSumContiguousSubarray = new MaxSumContiguousSubarray();
//        System.out.println(maxSumContiguousSubarray.maxSubArray(A));

//        int[] A = new int[]{1,2,3};
//        SumOfAllSubarrays sumOfAllSubarrays = new SumOfAllSubarrays();
//        System.out.println(sumOfAllSubarrays.subarraySum(A));

//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 100));
//        int B = 100;
//        SubarrayWithGivenSum subarrayWithGivenSum = new SubarrayWithGivenSum();
//        System.out.println(subarrayWithGivenSum.solve(A, B));

//        int[] A = new int[]{1, 2, 0};
//        FirstMissingInteger firstMissingInteger = new FirstMissingInteger();
//        System.out.println(firstMissingInteger.firstMissingPositive(A));
//        int[] A = new int[]{0, 1, 0, 2};
//        RainWaterTrapped rainWaterTrapped = new RainWaterTrapped();
//        System.out.println(rainWaterTrapped.trap(A));

//        ArrayList<Interval> A = new ArrayList<>();
//        A.add(new Interval(1, 3));
//        A.add(new Interval(6,9));
//        Interval insert = new Interval(2,6);
//        MergeIntervals mergeIntervals = new MergeIntervals();
//        mergeIntervals.insert(A, insert);

        int[] nums = new int[]{-7,-3,2,3,11};
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        System.out.println(squaresOfASortedArray.sortedSquares(nums));
    }
}