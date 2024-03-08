import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        VeryLargePower veryLargePower = new VeryLargePower();
//        veryLargePower.solve(10, 4);

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 2, 1, 3));
        RearrangeArray rearrangeArray = new RearrangeArray();
        System.out.println(rearrangeArray.arrange(A));
    }
}