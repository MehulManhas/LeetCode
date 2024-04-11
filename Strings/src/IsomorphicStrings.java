//https://leetcode.com/problems/isomorphic-strings/?envType=daily-question&envId=2024-04-02
import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        return transform(s).equals(transform(t));
    }
    public String transform(String s){
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }
            sb.append(" " + Integer.toString(map.get(s.charAt(i))));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
