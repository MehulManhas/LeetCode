import java.util.HashMap;

public class PairSumDivisibleByM {
    public int solve(int[] A, int B) {

        long output = 0;
        int mod = 1000000007;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<A.length;i++){
            int value = A[i] % B;
            if(map.containsKey(value)){
                map.put(value, map.get(value)+1);
            }else{
                map.put(value, 1);
            }
        }

        for (int i=1;i<(B+1)/2;i++){
            if(map.containsKey(i) && map.containsKey(B-i) ){
                long temp = map.get(i) * map.get(B-i);
                output = (temp+output) % mod;
            }
        }


        output += (map.getOrDefault(0,0)*(map.getOrDefault(0,0)-1))/2; // checking on 0th index // edge case

        if(B%2 == 0 && map.containsKey((B+1)/2)){ // checking on middle index // edge case
            long temp =  map.get((B+1)/2);
            output += (temp*(temp-1))/2;
            output = output % mod;
        }

        return (int)output%mod;
    }
}
