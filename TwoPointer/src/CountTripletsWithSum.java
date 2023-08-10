import java.util.HashMap;

public class CountTripletsWithSum {
    int[] arr;
    int sum = 0;
    public CountTripletsWithSum(int[] arr, int sum){
        this.arr = arr;
        this.sum = sum;
    }

    public int solve(){
        return 1;
    }
    public HashMap<Integer, Integer> createMap(){
        HashMap<Integer, Integer> intToCountMap = new HashMap<>();

        for(int i : arr){
            intToCountMap.put(intToCountMap.getOrDefault(i, intToCountMap.get(i)), 1);
        }
        return intToCountMap;
    }

}