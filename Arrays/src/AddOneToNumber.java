import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber {
    public AddOneToNumber(){

    }
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        A = removeLeadingZeros(A);

        boolean addedOne = false;
        for(int i=A.size()-1; i>=0; i--){
            if(A.get(i) + 1 <= 9){
                int element = A.get(i);
                A.remove(i);
                A.add(i, element+1);
                addedOne = true;
                break;
            }
            else{
                A.remove(i);
                A.add(i, 0);
            }
        }

        if(!addedOne){
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=0; i<=A.size(); i++){
                ans.add(0);
            }
            ans.remove(0);
            ans.add(0,1);

            return ans;
        }
        return A;
    }

    public ArrayList<Integer> removeLeadingZeros(ArrayList<Integer> A){

        while(true){
            if(A.get(0) == 0){
                A.remove(0);
            }
            else{
                break;
            }
        }

        return A;
    }


}
