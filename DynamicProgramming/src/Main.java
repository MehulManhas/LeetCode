public class Main {
    public static void main(String[] args) {
        String A = "abbcdgf";
        String B = "bbadcgf";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        longestCommonSubsequence.setValues(A, B);
        System.out.println(longestCommonSubsequence.calculateLongestCommonSubsequence());

        String A1 = "Anshuman";
        String B1 = "Antihuman";

        EditDistance editDistance = new EditDistance();
        editDistance.createDpArr(A1, B1);
        System.out.println(editDistance.calculateThroughDP(A1, B1, A1.length()-1, B1.length()-1));

        String A3 = "aaa";
        String B3 = "a*";

        RegexPatternMatching regexPatternMatching = new RegexPatternMatching();
        regexPatternMatching.createDpArr(A3, B3);
        System.out.println(regexPatternMatching.calculateThroughDP(A3, B3, A3.length()-1, B3.length()-1));
    }
}