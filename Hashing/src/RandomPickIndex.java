import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomPickIndex {
    HashMap<Integer, ArrayList<Integer>> numToIdxMap;
    public RandomPickIndex(){}



    public void Solution(int[] nums) {
        createMap(nums);
    }

    public void createMap(int[] nums){
        this.numToIdxMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(numToIdxMap.containsKey(nums[i])){
                ArrayList<Integer> currArr = numToIdxMap.get(nums[i]);
                currArr.add(i);
                numToIdxMap.put(nums[i], currArr);
            }
            else{
                ArrayList<Integer> currArr = new ArrayList<>();
                currArr.add(i);
                numToIdxMap.put(nums[i], currArr);
            }
        }
    }

    public int pick(int target) {

        return fetchRandomValue(target);
    }

    public int fetchRandomValue(int target){

        Random random = new Random();
        ArrayList<Integer> arr = numToIdxMap.get(target);
        return arr.get(random.nextInt(arr.size()));
    }

}
