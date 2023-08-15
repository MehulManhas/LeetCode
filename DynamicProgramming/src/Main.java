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

        int stairs = 44;
        ClimbingStairs climbingStairs = new ClimbingStairs();
        climbingStairs.createDpArr(stairs);
        System.out.println(climbingStairs.calculateThroughDp(stairs));

        int[][] arr = new int[][]{{-2, -3, 3},{-5, -10, 1},{10, 30, -5}};
        DungeonPrincess dungeonPrincess = new DungeonPrincess();
        System.out.println(dungeonPrincess.calculateMinimumHP(arr));

        int chordPairs = 5;
        IntersectingChordsInACircle intersectingChordsInACircle = new IntersectingChordsInACircle();
        System.out.println(intersectingChordsInACircle.chordCnt(chordPairs));
    }
}