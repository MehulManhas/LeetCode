//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JumpGame solution = new JumpGame();
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Test Case 1: nums = [2,3,1,1,4]");
        System.out.println("Can jump to last index? " + solution.canJumpSolutionTwo(nums1));

        // Test Case 2: [3,2,1,0,4]
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("\nTest Case 2: nums = [3,2,1,0,4]");
        System.out.println("Can jump to last index? " + solution.canJumpSolutionTwo(nums2));

        // Test Case 3: [0]
        int[] nums3 = {0};
        System.out.println("\nTest Case 3: nums = [0]");
        System.out.println("Can jump to last index? " + solution.canJumpSolutionTwo(nums3));
    }
}