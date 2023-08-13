import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SubarrayWithSumK swsk = new SubarrayWithSumK();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1000000000);
        int target = 1000000000;
        ArrayList<Integer> ans = swsk.solve(arr, target);

        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(10));
    }
}