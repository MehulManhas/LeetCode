import java.util.Collections;
import java.util.PriorityQueue;

public class MagicianAndChocolate {
    int seconds = 0;
    int[] chocolates;

    public MagicianAndChocolate(int seconds, int[] chocolates){
        this.seconds = seconds;
        this.chocolates = chocolates;
    }

    public int nchoc(int A, int[] B) {
        PriorityQueue<Integer> chocolateBag = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;

        for(int i : B){
            chocolateBag.add(i);
        }

        while(A > 0){

            if(chocolateBag.size() > 0){
                int currNum = chocolateBag.peek();
                chocolateBag.add((int) Math.floor(chocolateBag.remove()/2));
                sum = (sum + currNum)%1000000007;
            }
            A--;
        }

        return (int)sum;
    }
}
