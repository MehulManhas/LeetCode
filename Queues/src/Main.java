import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
//        ImplementQueuesWithStacks iqws = new ImplementQueuesWithStacks();
//        KthPalindromeNumber kpn = new KthPalindromeNumber();
//
//        System.out.println(kpn.solve(4));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        int B = 3;
//        ReversingElementsOfQueue reversingElementsOfQueue = new ReversingElementsOfQueue();
//        ArrayList<Integer> ans = reversingElementsOfQueue.solve(A, B);
//
//        for(int i : ans){
//            System.out.println(i);
//        }

//        NIntegersContainingOnly12and3 nIntegersContainingOnly12and3 = new NIntegersContainingOnly12and3();
//        ArrayList<Integer> ans = nIntegersContainingOnly12and3.solve(7);
//        for (Integer i : ans) {
//            System.out.println(i);
//        }
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 3, 1, 5, 4));
//        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
//        TaskScheduling taskScheduling = new TaskScheduling();
//        System.out.println(taskScheduling.solve(A, B));

//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
//
//        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
//
//        ArrayList<Integer> ans = slidingWindowMaximum.slidingMaximum(A,2 );
//
//        for(int a : ans){
//            System.out.println(a + " ");
//        }
        String A = new String("abcabc");
        FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
        System.out.println(firstNonRepeatingCharacter.solve(A));
    }
}