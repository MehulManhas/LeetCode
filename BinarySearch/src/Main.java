public class Main {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5};
        int[] A1 = new int[]{5, 17, 100, 11};
        int[] A2 = new int[]{100, 1, 2, 3, 4};
        FindAPeakElement findAPeakElement = new FindAPeakElement();

        System.out.println(findAPeakElement.solve(A2));

        int[][] mat = new int[][]{{3},{29},{36},{63},{67},{72},{74},{78},{75}};
        int target = 41;

        MatrixSearch matrixSearch = new MatrixSearch();

        System.out.println(matrixSearch.searchMatrix(mat, target));

        FindTargetIndicesAfterSortingArray findTargetIndicesAfterSortingArray = new FindTargetIndicesAfterSortingArray();
        System.out.println(findTargetIndicesAfterSortingArray.targetIndices(A, 3));
    }
}