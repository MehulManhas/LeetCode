//https://leetcode.com/problems/contiguous-array/?envType=daily-question&envId=2024-03-16
import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLength = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++){
            count = count + (nums[i] == 1 ? 1 : -1);
            if(map.containsKey(count)){
                maxLength = Math.max(maxLength, i-map.get(count));
            }
            else{
                map.put(count, i);
            }
        }

        return maxLength;
    }
}
