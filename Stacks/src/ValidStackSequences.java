
import java.util.Stack;

public class ValidStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for(int pushedElement : pushed){
            stack.push(pushedElement);
            while(!stack.isEmpty() && j<popped.length && stack.peek()==popped[j]){
                j++;
                stack.pop();
            }
        }
        return j==popped.length;
    }
}
