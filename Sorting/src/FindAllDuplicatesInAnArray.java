//https://leetcode.com/problems/find-all-duplicates-in-an-array/?envType=daily-question&envId=2024-03-25

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);

        for(int i=1;i<len;i++) {
            if(nums[i]==nums[i-1]) {
                ans.add(nums[i]);
                i++;
            }
        }
        return ans;
    }
}

