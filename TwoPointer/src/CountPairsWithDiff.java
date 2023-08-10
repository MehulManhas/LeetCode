import java.util.Arrays;
import java.util.HashSet;

public class CountPairsWithDiff {

    public CountPairsWithDiff(){

    }

    public int solve(int[] arr, int diff){
        HashSet<String> set = new HashSet<>();

        Arrays.sort(arr);

        int startIdx = 0;
        int endIdx = 1;


        while(startIdx < arr.length && endIdx < arr.length){

            if(arr[endIdx] - arr[startIdx] == diff && startIdx != endIdx){
                String combinaton1 = new String(arr[endIdx] +" "+ arr[startIdx]);

                if(!set.contains(combinaton1)){
                    set.add(combinaton1);
                }
                startIdx++;
            }
            else if(arr[endIdx] - arr[startIdx] > diff){
                startIdx++;
            }
            else{
                endIdx++;
            }
        }

        return set.size();
    }
}
