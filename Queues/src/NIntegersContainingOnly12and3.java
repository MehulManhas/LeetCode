import  java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NIntegersContainingOnly12and3 {
    public NIntegersContainingOnly12and3(){

    }

    public ArrayList<Integer> solve(int A) {
        Queue<String> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        queue.add("1");
        queue.add("2");
        queue.add("3");

        for(int i=0; i<A; i++){
            String currentElement = queue.remove();
            queue.add(currentElement + "1");
            queue.add(currentElement + "2");
            queue.add(currentElement + "3");
            ans.add(i, Integer.parseInt(currentElement));
        }

        return ans;
    }
    public boolean checkDigits(int num){
        if(num == 1){
            return true;
        }

        int currDigit = num%10;

        if(currDigit != 1 || currDigit != 2 || currDigit != 3){
            return false;
        }

        return checkDigits(num/10);
    }
}
