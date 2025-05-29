import java.util.*;

//https://leetcode.com/problems/longest-common-subsequence-between-sorted-arrays/?envType=weekly-question&envId=2024-06-01
public class LongestCommonSubsequenceBetweenSortedArrays {
    public List<Integer> longestCommonSubsequence(int[][] arrays) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int target = arrays.length;
        List<Integer> ans = new ArrayList<>();

        for(int[] arr : arrays){
            for(int i : arr){
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == target){
                ans.add(entry.getKey());
            }
        }
        Collections.sort(ans);

        return ans;
    }
}
