//https://www.scaler.com/academy/mentee-dashboard/class/35576/assignment/problems/333/?navref=cl_pb_nv_tb

import java.util.ArrayList;
import java.util.HashMap;


public class DistinctNumbersInWindow {

    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> distinctNumbers = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<B; i++){
            if(distinctNumbers.containsKey(A.get(i))){
                distinctNumbers.put(A.get(i), distinctNumbers.get(A.get(i))+1);
            }
            else{
                distinctNumbers.put(A.get(i), 1);
            }
        }

        ans.add(distinctNumbers.size());

        int start = 1;
        int end = B;

        while(end < A.size()){

            if(distinctNumbers.get(A.get(start-1)) > 1){
                distinctNumbers.put(A.get(start-1), distinctNumbers.get(A.get(start-1))-1);
            }
            else if(distinctNumbers.get(A.get(start-1)) == 1){
                distinctNumbers.remove(A.get(start-1));
            }

            if(distinctNumbers.containsKey(A.get(end))){
                distinctNumbers.put(A.get(end), distinctNumbers.get(A.get(end))+1);
            }
            else{
                distinctNumbers.put(A.get(end), 1);
            }

            ans.add(distinctNumbers.size());

            start++;
            end++;
        }

        return ans;
    }
}
