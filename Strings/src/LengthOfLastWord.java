//https://leetcode.com/problems/length-of-last-word/?envType=daily-question&envId=2024-04-01
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        return arr[arr.length-1].length();
    }
}
