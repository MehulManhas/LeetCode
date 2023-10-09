import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> A = new ArrayList<>(Arrays.asList("zebra", "dog", "duck", "dove"));
        ShortestUniquePrefix shortestUniquePrefix = new ShortestUniquePrefix();
        System.out.println(shortestUniquePrefix.prefix(A));
    }
}