import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {public int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();
    int maxLength = 0;
    int startPointer = 0;
    int endPointer = 0;

    while(endPointer < s.length()){
        if(!set.contains(s.charAt(endPointer))){
            set.add(s.charAt(endPointer));
            maxLength = Math.max(maxLength, set.size());
            endPointer++;
        }else{
            set.remove(s.charAt(startPointer));
            startPointer++;
        }
    }

    return maxLength;
}

}
