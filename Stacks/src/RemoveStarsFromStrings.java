import java.util.Stack;

public class RemoveStarsFromStrings {
    public String removeStars(String s) {
        Stack<Character> charStack = new Stack<>();

        for(Character c : s.toCharArray()){
            if(c == '*'){
                charStack.pop();
            }
            else{
                charStack.push(c);
            }
        }

        StringBuilder ans = new StringBuilder();

        while(!charStack.isEmpty()){
            ans.append(charStack.pop());
        }

        return ans.reverse().toString();
    }
}
