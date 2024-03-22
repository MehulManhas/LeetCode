import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveVowelsFromAString {
    public String removeVowels(String s) {
        Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'i','o','u'));
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(!vowels.contains(s.charAt(i))){
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}
