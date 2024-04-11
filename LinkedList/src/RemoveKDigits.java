//https://leetcode.com/problems/remove-k-digits/?envType=daily-question&envId=2024-04-11
import java.util.LinkedList;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        LinkedList<Character> stack = new LinkedList<>();

        for(Character digit : num.toCharArray()){
            while(stack.size() > 0 && k > 0 && stack.peekLast() > digit){
                stack.removeLast();
                k--;
            }
            stack.addLast(digit);
        }

        for(int i=0; i<k; i++){
            stack.removeLast();
        }

        StringBuilder ans = new StringBuilder();

        boolean leadingZeroPresent = true;

        for(Character digit : stack){
            if(leadingZeroPresent && digit == '0'){
                continue;
            }
            leadingZeroPresent = false;
            ans.append(digit);
        }

        if(ans.length() == 0){
            return "0";
        }
        return ans.toString();
    }
}
