import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ReversePolishNotation rpn = new ReversePolishNotation();
//        String[] quest1 = new String[]{"2","1","+","3","*"};
//
//        System.out.print(rpn.evalRPN(quest1));

//        BaseBallGame bbg = new BaseBallGame();
//        String[] quest2 = new String[]{"5","2","C","D","+"};
//        System.out.println(bbg.calPoints(quest2));

//        NextSmallerElement nse = new NextSmallerElement();
//        int[] quest3 = new int[]{ 34, 35, 27, 42, 5, 28, 39, 20, 28 };
//
//
//        System.out.println(nse.prevSmaller(quest3));

//        int[] pushed = new int[]{1,2,3,4,5};
//        int[] popped = new int[]{4,5,3,2,1}; // true
//        int[] popped1 = new int[]{4,3,5,1,2}; //false
//        ValidStackSequences validStackSequences = new ValidStackSequences();
//        System.out.println(validStackSequences.validateStackSequences(pushed, popped));

//        int[] A = new int[]{5, 17, 100, 11};
//        SortStackUsingAnotherStack sortStackUsingAnotherStack = new SortStackUsingAnotherStack();
//        int[] ans = sortStackUsingAnotherStack.solve(A);

//        MinStack minStack = new MinStack();
//        //minStack.push(19);
//        minStack.push(10);
//        minStack.push(9);
//        System.out.println(minStack.getMin());
//        minStack.push(8);
//        System.out.println(minStack.getMin());
//        minStack.push(7);
//        System.out.println(minStack.getMin());
//        minStack.push(6);
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.getMin());


        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(39,27,11,4,24,32,32,1));
        NextGreater nextGreater = new NextGreater();
        for(Integer i : nextGreater.nextGreater(A)){
            System.out.println(i);
        }
    }
}