
//https://www.scaler.com/academy/mentee-dashboard/class/30024/assignment/problems/185?navref=cl_tt_lst_nm
public class LongestPalindromicSubstring {
    public String longestPalindrome(String A) {
        int maxLength = 0;
        int start = 0;
        int end = 0;

        for(int i=0; i<A.length(); i++){

            int[] oddSubstring = getLongestPalindromicSubstring(A, i, i);

            int[] evenSubstring = getLongestPalindromicSubstring(A, i, i+1);

            int[] currentPalindrome = oddSubstring[0] > evenSubstring[0] ? oddSubstring : evenSubstring;

            if(currentPalindrome[0] > maxLength){
                maxLength = currentPalindrome[0];
                start = currentPalindrome[1];
                end = currentPalindrome[2];
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=start; i<=end; i++){
            sb.append(A.charAt(i));
        }
        return sb.toString();
    }

    public int[] getLongestPalindromicSubstring(String A, int leftStart, int rightStart){

        while(leftStart > 0 && rightStart < A.length() && A.charAt(leftStart) == A.charAt(rightStart)){
            leftStart--;
            rightStart++;
        }

        return new int[]{rightStart - leftStart - 1, leftStart+1, rightStart-1};
    }
}
