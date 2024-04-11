//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/?envType=daily-question&envId=2024-04-04
import java.util.Stack;
public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int maxDepth = 0;
        for(Character c : s.toCharArray()){
            if(c == '('){
                stack.push('(');
            }
            else if(c == ')'){
                maxDepth = Math.max(maxDepth, stack.size());
                stack.pop();
            }
        }

        return maxDepth;
    }
}
