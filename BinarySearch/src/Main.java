public class Main {
    public static void main(String[] args) {
//        int[] A = new int[]{1, 2, 3, 4, 5};
//
//        int[] A2 = new int[]{100, 1, 2, 3, 4};
//        FindAPeakElement findAPeakElement = new FindAPeakElement();
//
//        System.out.println(findAPeakElement.solve(A2));
//
//        int[][] mat = new int[][]{{3},{29},{36},{63},{67},{72},{74},{78},{75}};
//        int target = 41;
//
//        MatrixSearch matrixSearch = new MatrixSearch();
//
//        System.out.println(matrixSearch.searchMatrix(mat, target));
//
//        FindTargetIndicesAfterSortingArray findTargetIndicesAfterSortingArray = new FindTargetIndicesAfterSortingArray();
//        System.out.println(findTargetIndicesAfterSortingArray.targetIndices(A, 3));
//
//        int[] bitArr = new int[]{1,2,3,4,5,6,7,8,9,10,20,19,18,17,16,15,14,13,12,11};
//        int B = 12;
//        SearchInBitonicArray searchInBitonicArray = new SearchInBitonicArray();
//        System.out.println(searchInBitonicArray.solve(bitArr, B));


        int[][] A = new int[][]{{1, 3, 5},{2, 6, 9},{3, 6, 9}};
        //int[][] A = new int[][]{{1}};

        MatrixMedian matrixMedian = new MatrixMedian();
        System.out.println(matrixMedian.findMedian(A));

    }
}