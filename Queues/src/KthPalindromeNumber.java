import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthPalindromeNumber {
    public String solve(int A) {
        Queue<String> digitQueue=new LinkedList<>();
        ArrayList<String> ans=new ArrayList<>();

        digitQueue.add("1");
        digitQueue.add("2");

        for(int i=0;i<A;i++){
            String s=digitQueue.remove();
            String st= new StringBuilder(s).reverse().toString();
            ans.add(s+st);
            digitQueue.add(s+"1");
            digitQueue.add(s+"2");
        }
        return ans.get(A-1);
    }
}
