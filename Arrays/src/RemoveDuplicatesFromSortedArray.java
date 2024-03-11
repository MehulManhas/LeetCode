//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int currentElement = nums[0];
        for(int i=1; i<nums.length; i++){

            if(currentElement == nums[i]){
                nums[i] = Integer.MIN_VALUE;
            }
            else{
                currentElement = nums[i];
            }
        }

        int nextPosition = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != Integer.MIN_VALUE){
                nums[nextPosition++] = nums[i];

            }
        }
        return nextPosition;
    }
}
