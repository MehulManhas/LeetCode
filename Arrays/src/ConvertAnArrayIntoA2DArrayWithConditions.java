
import java.util.ArrayList;
import java.util.Arrays;


public class ConvertAnArrayIntoA2DArrayWithConditions {

    public ConvertAnArrayIntoA2DArrayWithConditions(){}

    public ArrayList<ArrayList<Integer>> findMatrix(int[] nums) {
        int[] countSort = new int[201];

        for(int i=0; i< nums.length; i++){
            countSort[nums[i]]++;
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int j=1; j<countSort.length; j++){
            int totalArraysReq = countSort[j];

            if(totalArraysReq > 0){

                for(int i=0; i<totalArraysReq; i++){
                    if(ans.isEmpty()){
                        ans.add(new ArrayList<>());
                        ans.get(i).add(j);
                    }
                    else if(ans.size() < totalArraysReq){
                        ans.add(new ArrayList<>());
                        ans.get(i).add(j);
                    }
                    else if(ans.size() >= totalArraysReq){
                        ans.get(i).add(j);
                    }
                }
            }
        }
        return ans;
    }
}
