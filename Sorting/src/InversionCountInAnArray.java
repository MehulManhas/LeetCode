import java.util.Arrays;

public class InversionCountInAnArray {
    int count = 0;
    int mod = (int) Math.pow(10,9) + 7;
    public int solve(int[] A) {

        mergeSortAndCount(A, 0, A.length-1);
        return count;
    }

    public void mergeSortAndCount(int[] A, int left, int right){

        if(left < right){
            int mid = (left + right)/2;

            mergeSortAndCount(A, left, mid);

            mergeSortAndCount(A, mid+1, right);

            mergeAndCount(A, left, mid, right);
        }
    }

    public void mergeAndCount(int[] A, int left, int mid, int right){

        int[] leftArr = Arrays.copyOfRange(A, left, mid+1);

        int[] rightArr = Arrays.copyOfRange(A, mid+1, right+1);

        int leftPtr = 0;
        int rightPtr = 0;
        int k = left;


        while (leftPtr < leftArr.length && rightPtr < rightArr.length){
            if(leftArr[leftPtr] <= rightArr[rightPtr]){
                A[k++] = leftArr[leftPtr++];
            }
            else{
                A[k++] = rightArr[rightPtr++];
                count = (count + (leftArr.length - leftPtr))%mod;
            }
        }

        while (leftPtr < leftArr.length){
            A[k++] = leftArr[leftPtr++];
        }
        while (rightPtr < rightArr.length){
            A[k++] = rightArr[rightPtr++];
        }

    }
}
