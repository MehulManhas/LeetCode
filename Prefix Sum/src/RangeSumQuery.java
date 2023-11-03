import java.util.ArrayList;

public class RangeSumQuery {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> prefixSum = createPrefixSumArr(A);
        ArrayList<Long> ans = new ArrayList<>();

        for(ArrayList<Integer> currentQuery : B){
            int startIndex = currentQuery.get(0);
            int endIndex = currentQuery.get(1);

            ans.add(executeQuery(startIndex, endIndex, A, prefixSum));
        }

        return ans;
    }
    public ArrayList<Long> createPrefixSumArr(ArrayList<Integer> A){
        ArrayList<Long> prefixSum = new ArrayList<>();

        prefixSum.add((long) A.get(0));
        for(int i=1; i<A.size(); i++){
            prefixSum.add(prefixSum.get(i-1) + (long) A.get(i));
        }

        return prefixSum;
    }

    public long executeQuery(int startIndex, int endIndex, ArrayList<Integer> A, ArrayList<Long> prefixSum){

        if(startIndex == 0 && endIndex <= A.size()-1){
            return prefixSum.get(endIndex);
        }
        else if(startIndex > 0 && endIndex <= A.size()-1){
            return prefixSum.get(endIndex) - prefixSum.get(startIndex -1);
        }

        return -1;
    }
}
