import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

//        int[] A = new int[]{5, 3, 1, 9, 4};
//        CountSwapsInInsertionSortII countSwapsInInsertionSortII = new CountSwapsInInsertionSortII();
//        System.out.println(countSwapsInInsertionSortII.solve(A));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(6, 8, 9));
//        FactorsSort factorsSort = new FactorsSort();
//        System.out.println(factorsSort.solve(A));

//        int[] A = new int[]{12, 11, 13, 5, 6, 7};
//        MergeSort mergeSort = new MergeSort();
//        int[] ans = mergeSort.solve(A);
//
//        for(int i : A){
//            System.out.print(i + " ");
//        }
//        int[] A = new int[]{12, 11, 13, 5, 6, 7};
//        QuickSort quickSort = new QuickSort();
//        quickSort.solve(A);
//
//        for(int i : A){
//            System.out.print(i + " ");
//        }
//        int[] A = new int[]{28,18,44,49,41,14};
//        InversionCountInAnArray inversionCountInAnArray = new InversionCountInAnArray();
//        System.out.println(inversionCountInAnArray.solve(A));

//        int[] A = new int[]{3, 5, 10};
//        SumTheDifference sumTheDifference = new SumTheDifference();
//        System.out.println(sumTheDifference.solve(A));

//        List<Integer> A = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
//        LargestNumber largestNumber = new LargestNumber();
//        System.out.println(largestNumber.largestNumber(A));

        int[][] A = new int[][]{{1, 3}, {-2, 2}};
        int B = 1;
        BClosestPointsToOrigin bClosestPointsToOrigin = new BClosestPointsToOrigin();
        System.out.println(bClosestPointsToOrigin.solve(A, B));
    }
}