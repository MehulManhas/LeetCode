//https://leetcode.com/problems/make-the-string-great/?envType=daily-question&envId=2024-04-05
import java.util.Stack;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        Stack<Character> charStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(Character c : s.toCharArray()){
            int current = c - '0';
            if(!charStack.isEmpty() && Math.abs(charStack.peek() - '0' - current) == 32){
                charStack.pop();
            }
            else{
                charStack.push(c);
            }
        }

        charStack.forEach(c -> sb.append(c));
        return sb.toString();
    }
}
