import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class PairsWithGivenSumII{
    ArrayList<Integer> arr;
    int sum = 0;

    public PairsWithGivenSumII(ArrayList<Integer> arr, int sum){
        this.arr = arr;
        this.sum = sum;
    }

    public ArrayList<Integer> createSet(){
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }

        ArrayList<Integer> arraySet = new ArrayList<>();

        for(int i : set){
            arraySet.add(i);
        }

        Collections.sort(arraySet);
        return arraySet;
    }
    public HashMap<Integer, Integer> createMap(){

        HashMap<Integer, Integer> numToIndexMap = new HashMap<>();

        for(int i=0; i<arr.size(); i++){
            if(!numToIndexMap.containsKey(arr.get(i))){
                numToIndexMap.put(arr.get(i), 1);
            }
            else{
                numToIndexMap.put(arr.get(i), numToIndexMap.get(arr.get(i))+1);
            }
        }
        return numToIndexMap;
    }

    public int solve(HashMap<Integer, Integer> map, ArrayList<Integer> set, int target){
        long modVal = (int) Math.pow(10,9)+7;
        long ans = 0;
        int left = 0;
        int right = set.size()-1;

        while(left<=right){
            int total = set.get(left) + set.get(right);

            if(total < target){
                left++;
                continue;
            }

            if(total > right){
                right--;
                continue;
            }

            long leftFreq = map.get(left);
            long rightFreq = map.get(right);

            if(total == target){
                if(left == right){
                    ans += (leftFreq*(leftFreq-1))/2;
                    ans = ans % modVal;

                    return (int) ans;
                }
                else{
                    ans += leftFreq*(leftFreq-1);
                    ans = ans % modVal;

                }
                right--;
                left++;
            }
        }
        return (int) ans;
    }

}