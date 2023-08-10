import java.util.ArrayList;
import java.util.Collections;

public class ThreeSumZero {
    public ThreeSumZero(){

    }

    public ArrayList<ArrayList<Integer>> compute(ArrayList<Integer> A){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(A.size() < 3){
            ArrayList<Integer> innerList = new ArrayList<>();
            innerList.add(0);
            ans.add(innerList);
            return ans;
        }

        Collections.sort(A);

        int start = 0;
        int current = 1;
        int end = 2;
        int ansIdx = 0;

        while(start < end){
            if(A.get(start) + A.get(current) + A.get(end) == 0){
                ArrayList<Integer> innerList = new ArrayList<>();
                innerList.add(start);
                innerList.add(current);
                innerList.add(end);
                ans.add(innerList);
                end++;
                ansIdx++;
            }
            else if(A.get(start) + A.get(current) + A.get(end) > 0){
                start++;
            }
            else if(A.get(start) + A.get(current) + A.get(end) < 0){
                end++;
            }
        }

        if(ans.isEmpty()){
            ArrayList<Integer> innerList = new ArrayList<>();
            innerList.add(0);
            ans.add(innerList);
            return ans;
        }
        return ans;
    }
}
