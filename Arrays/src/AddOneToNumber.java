import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber {
    public AddOneToNumber(){

    }
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>(A.size());


        for(int i=A.size()-1; i>=0; i--){
            if(A.get(i) + 1 > 9){
                A.add(i, 0);
            }
            else if(A.get(i) + 1 <= 9){

                A.add(i, A.get(i)+1);
                A.remove(i+1);
                break;
            }
        }

        while (A.get(itr) == 0){
            if(A.get(i) == 0){
                A.remove(i);
            }
            else{
                break;
            }
        }

        return ans;
    }
}
