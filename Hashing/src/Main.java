import java.util.ArrayList;

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

        int[] nums = new int[]{1, 2, 3, 3, 3};
        int[] choice = new int[]{3, 1, 3};
        RandomPickIndex randomPickIndex = new RandomPickIndex();
        randomPickIndex.Solution(nums);

        for(int i : choice){
            System.out.println(randomPickIndex.pick(i));
        }



    }
}