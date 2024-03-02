public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] numArr = countSort(nums);

        return squareAndSortArr(numArr, nums);
    }

    public int[] countSort(int[] nums){
        int[] numArr = new int[(int)Math.pow(10, 4) + 1];
        for(int i=0; i<nums.length; i++){
            numArr[Math.abs(nums[i])]++;
        }
        return numArr;
    }

    public int[] squareAndSortArr(int[] numArr, int[] nums){
        int index = nums.length-1;
        for(int i=numArr.length-1; i>=0; i--){
            if(numArr[i] == 1){
                nums[index--] = i*i;
            }
            else if(numArr[i] > 1){
                for(int j=0; j<numArr[i]; j++){
                    nums[index--] = i*i;
                }
            }
        }

        return nums;
    }
}
