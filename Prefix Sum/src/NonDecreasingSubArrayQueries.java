import java.util.ArrayList;
import java.util.Collections;

public class NonDecreasingSubArrayQueries {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        //1, 7, 3, 4, 9
        //0, 1, 2, 2, 2
        ArrayList<Integer> preComputed = preComputeArray(A);

        return executeQueries(preComputed, B);
    }

    public ArrayList<Integer> preComputeArray(ArrayList<Integer> A){
        ArrayList<Integer> preComputed = new ArrayList<>();

        preComputed.add(0, 0);

        for(int i=1; i<A.size(); i++){

            if(A.get(i-1) > A.get(i)){
                preComputed.add(i, preComputed.get(i-1) + 1);
            }
            else{
                preComputed.add(preComputed.get(i-1));
            }
        }

        return preComputed;
    }

    public ArrayList<Integer> executeQueries(ArrayList<Integer> preComputed, ArrayList<ArrayList<Integer>> B){
        ArrayList<Integer> result = new ArrayList<>();

        Collections.fill(result, -1);

        for(ArrayList<Integer> currentQuery : B){
            int start = currentQuery.get(0);
            int end = currentQuery.get(1);

            if(preComputed.get(end) - preComputed.get(start) == 0){
                result.add(1);
            }
            else{
                result.add(0);
            }
        }

        return result;
    }
}
