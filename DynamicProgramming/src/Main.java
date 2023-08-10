public class Main {
    public static void main(String[] args) {
        String A = "abbcdgf";
        String B = "bbadcgf";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        longestCommonSubsequence.setValues(A, B);
        System.out.println(longestCommonSubsequence.calculateLongestCommonSubsequence());
    }
}