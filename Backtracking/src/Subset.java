import java.util.ArrayList;
import java.util.Collections;

public class Subset {

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<Integer> subset = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(A);
        int index = 0;

        return calculateAllSubsets(A, result, subset, index);
    }

    public ArrayList<ArrayList<Integer>> calculateAllSubsets(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> subset, int index){
        result.add(new ArrayList<>(subset));

        for(int i=index; i<A.size(); i++){
            subset.add(A.get(i));
            calculateAllSubsets(A, result, subset, i+1);
            subset.remove(subset.size()-1);
        }

        return result;
    }
}
