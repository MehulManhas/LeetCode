import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FactorsSort {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A, new FactorComparator());
        return A;
    }

    class FactorComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            int num1 = getCountOfFactors(o1);
            int num2 = getCountOfFactors(o2);

            if(num1 != num2){
                return Integer.compare(num1, num2);
            }
            else{
                return Integer.compare(o1, o2);
            }
        }

        public int getCountOfFactors(Integer num){
            int count = 0;

            for(int i=1; i<=Math.floor(num/2); i++){

                if(num%i == 0){
                    count++;
                }
            }
            return count;
        }
    }
}
