import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,3,4,3,4,4,1));
        int B = 6;
        PickFromBothSides pickFromBothSides = new PickFromBothSides();
        System.out.println(pickFromBothSides.solve(A, B));
    }
}