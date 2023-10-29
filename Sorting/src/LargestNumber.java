import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LargestNumber {
    public String largestNumber(final List<Integer> A) {
        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = Integer.toString(o1) + Integer.toString(o2);
                String s2 = Integer.toString(o2) + Integer.toString(o1);

                return s2.compareTo(s1);
            }
        });

        if(A.get(0) == 0){
            return "0";
        }

        StringBuilder ans = new StringBuilder();
        for(Integer i : A){
            ans.append(i);
        }

        return ans.toString();
    }


}
