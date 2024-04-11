//https://leetcode.com/problems/valid-parenthesis-string/?envType=daily-question&envId=2024-04-07
import java.util.Arrays;

public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        int[][] dpArr = new int[s.length()][s.length()];
        for(int[] row : dpArr){
            Arrays.fill(row, -1);
        }

        return isValidString(0, 0, s, dpArr);
    }
    public boolean isValidString(int index, int openCount, String str, int[][] dpArr){
        if(index == str.length()){
            return openCount == 0;
        }
        if(dpArr[index][openCount] != -1){
            return dpArr[index][openCount] == 1;
        }

        boolean isValid = false;

        if(str.charAt(index) == '*'){
            isValid = isValid || isValidString(index+1, openCount+1, str, dpArr);

            if(openCount > 0){
                isValid = isValid || isValidString(index+1, openCount-1, str, dpArr);
            }

            isValid = isValid || isValidString(index+1, openCount, str, dpArr);
        }
        else{
            if(str.charAt(index) == '('){
                isValid = isValidString(index+1, openCount+1, str, dpArr);
            }
            else if(openCount > 0){
                isValid = isValidString(index+1, openCount-1, str, dpArr);
            }
        }

        dpArr[index][openCount] = isValid ? 1 : 0;
        return isValid;
    }
}
