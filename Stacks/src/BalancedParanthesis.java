import java.util.Stack;

public class BalancedParanthesis {
    public int solve(String A) {

        Stack<Character> characterStack = new Stack<>();

        for(char c : A.toCharArray()){
            if(characterStack.isEmpty()){
               characterStack.add(c);
            }
            else if(!characterStack.isEmpty()){
                if(characterStack.peek() == '(' && c == ')'){
                    characterStack.pop();
                }
                else if(characterStack.peek() == '[' && c == ']'){
                    characterStack.pop();
                } else if (characterStack.peek() == '{' && c == '}') {
                    characterStack.pop();
                }
                else {
                    characterStack.add(c);
                }
            }
        }

        return characterStack.size() == 0 ? 1 : 0;
    }
}
