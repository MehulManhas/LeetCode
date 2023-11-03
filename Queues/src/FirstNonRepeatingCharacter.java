import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {
    public String solve(String A) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        Queue<Character> charQueue = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        for(Character c : A.toCharArray()){

            charMap.put(c, charMap.getOrDefault(c, 0)+1);

            charQueue.add(c);

            while (!charQueue.isEmpty() && charMap.get(charQueue.peek()) > 1){
                charQueue.poll();
            }

            if(charQueue.isEmpty()){
                ans.append("#");
            }
            else{
                ans.append(charQueue.peek());
            }
        }

        return ans.toString();
    }
}
