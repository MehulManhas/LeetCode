import java.util.HashMap;

public class LongestSubarrayZeroSum {
    public int solve(int[] A) {
        int len = 0;
        int max = Integer.MIN_VALUE;

        long[] prefixSum = calcPrefixSum(A);

        HashMap<Long, Integer> prefixSumToIndexMap = new HashMap<>();
        prefixSumToIndexMap.put(0L, -1);

        for(int i=0; i<prefixSum.length; i++) {
            if(!prefixSumToIndexMap.containsKey(prefixSum[i])){
                prefixSumToIndexMap.put(prefixSum[i], i);
            }
            else{
                len = i - prefixSumToIndexMap.get(prefixSum[i]);
                max = Math.max(len, max);
            }
        }

        if(max < 0){
            return -1;
        }

        return max;
    }

    public long[] calcPrefixSum(int[] A){
        long[] prefixSum = new long[A.length];

        prefixSum[0] = A[0];

        for(int i=1; i<A.length; i++){
            prefixSum[i] = prefixSum[i-1] + A[i];
        }

        return prefixSum;
    }
}
