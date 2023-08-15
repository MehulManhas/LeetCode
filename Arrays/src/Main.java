public class Main {
    public static void main(String[] args) {
//        ConvertAnArrayIntoA2DArrayWithConditions convertAnArrayIntoA2DArrayWithConditions = new ConvertAnArrayIntoA2DArrayWithConditions();
//        int[] input = new int[]{1,3,4,1,2,3,1};
//        int[] input1 = new int[]{1,2,3,4};
//        System.out.println(convertAnArrayIntoA2DArrayWithConditions.findMatrix(input));

        int[] arr = new int[]{1,2,0};
        int[] arr1 = new int[]{3,4,-1,1};
        int[] arr3 = new int[]{7,8,9,11,12};
        int[] arr4 = new int[]{-1020, -21, 2323, -234,-321, 321, -1, -780, -15, 14567,1324, 123565, 1235669,2, 4, 6, 1, 10, 60, 90, -10, -10, -20, -21, -18, 0, 45, 1};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        firstMissingPositive.calculateFirstMissing(arr4);


    }
}