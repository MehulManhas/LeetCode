import java.util.ArrayList;

public class RearrangeArray {
    public ArrayList<Integer> arrange(ArrayList<Integer> A) {

        int mul = A.size();
        for(int i = 0; i < A.size(); i++){
            int val = mul * A.get(i);
            A.set(i,val);
        }

        for(int i = 0; i < A.size(); i++){
            int newIdx = A.get(i)/mul;
            int newVal = A.get(newIdx)/mul + A.get(i);
            A.set(i,newVal);
        }

        for(int i = 0; i < A.size(); i++){
            int val = A.get(i) % mul;
            A.set(i,val);
        }
        return A;
    }
}
