import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        SubarrayWithSumK swsk = new SubarrayWithSumK();
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(1000000000);
//        int target = 1000000000;
//        ArrayList<Integer> ans = swsk.solve(arr, target);
//
//        HappyNumber happyNumber = new HappyNumber();
//        System.out.println(happyNumber.isHappy(10));

//        int[] nums = new int[]{1, 2, 3, 3, 3};
//        int[] choice = new int[]{3, 1, 3};
//        RandomPickIndex randomPickIndex = new RandomPickIndex();
//        randomPickIndex.Solution(nums);
//
//        for(int i : choice){
//            System.out.println(randomPickIndex.pick(i));
//        }

//        String A = "bcbc";
//        CountA countA = new CountA();
//        System.out.println(countA.solve(A));

        //ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(80,18,80,80,80,80,80,80,94,18));
//
//        int B = 8;
//        DistinctNumbersInWindow distinctNumbersInWindow = new DistinctNumbersInWindow();
//        ArrayList<Integer> ans = distinctNumbersInWindow.dNums(A, B);

//        int[] A = new int[]{1, 1, 2, 2, 3, 3};
//        int[] B = new int[]{1, 2, 1, 2, 1, 2};
//        CountRectangles countRectangles = new CountRectangles();
//        System.out.println(countRectangles.solve(A, B));

//        String A = "bottle";
//        FrequencyBasedSorting frequencyBasedSorting = new FrequencyBasedSorting();
//        System.out.println(frequencyBasedSorting.solve(A));

        int[] A = new int[]{3, 2, -1};
        LongestSubarrayZeroSum longestSubarrayZeroSum = new LongestSubarrayZeroSum();
        System.out.println(longestSubarrayZeroSum.solve(A));

    }
}