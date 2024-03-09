//https://leetcode.com/problems/minimum-common-value/description/?envType=daily-question&envId=2024-03-09
public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        int list1 = 0;
        int list2 = 0;

        while(list1 < nums1.length && list2 < nums2.length){
            if(nums1[list1] == nums2[list2]){
                return nums1[list1];
            }
            else if(nums1[list1] < nums2[list2]){
                list1++;
            }
            else if(nums1[list1] > nums2[list2]){
                list2++;
            }
        }

        return -1;
    }
}
