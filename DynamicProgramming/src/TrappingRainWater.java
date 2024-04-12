//https://leetcode.com/problems/trapping-rain-water/description/?envType=daily-question&envId=2024-04-12
public class TrappingRainWater {
    public int trap(int[] height) {
        if(height.length == 0){
            return 0;
        }

        int ans = 0;
        int size = height.length;
        int[] left_max = new int[size];
        int[] right_max = new int[size];

        left_max[0] = height[0];
        for(int j=1; j<size; j++){
            left_max[j] = Math.max(left_max[j-1], height[j]);
        }

        right_max[size-1] = height[size-1];
        for(int j=size-2; j>=0; j--){
            right_max[j] = Math.max(right_max[j+1], height[j]);
        }
        for(int i=1; i<size-1; i++){
            ans += Math.min(left_max[i], right_max[i]) - height[i];
        }

        return ans;
    }
}
