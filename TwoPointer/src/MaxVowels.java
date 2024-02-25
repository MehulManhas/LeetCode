//Question : https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/?envType=study-plan-v2&envId=leetcode-75

import java.util.HashSet;
import java.util.Set;

public class MaxVowels {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));
        int maxLength = 0;
        int startIndex = 0;
        int ans = 0;

        for(int i=0; i<k; i++){
            if(vowels.contains(s.charAt(i))){
                maxLength += 1;
            }
        }

        for(int endIndex = k; endIndex <s.length() && startIndex <s.length(); endIndex++, startIndex++){
            ans = Math.max(ans, maxLength);
            if(vowels.contains(s.charAt(startIndex)) && vowels.contains(s.charAt(endIndex))){
                continue;
            }
            else if(!vowels.contains(s.charAt(startIndex)) && vowels.contains(s.charAt(endIndex))){
                maxLength += 1;
            }
            else if(vowels.contains(s.charAt(startIndex)) && !vowels.contains(s.charAt(endIndex))){
                maxLength -= 1;
            }
            else if(!vowels.contains(s.charAt(startIndex)) && !vowels.contains(s.charAt(endIndex))){
                continue;
            }
        }

        return Math.max(ans, maxLength);
    }
}
