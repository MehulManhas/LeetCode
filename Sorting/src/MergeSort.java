import java.util.ArrayList;

public class MergeSort {

    public int[] solve(int[] A) {
        sort(A, 0, A.length-1);

        return A;
    }
    public void merge(int[] A, int left, int mid, int right){

        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftSubArray = new int[leftSize];
        int[] rightSubArray = new int[rightSize];

        for(int i=0; i<leftSize; i++){
            leftSubArray[i] = A[left + i];
        }
        for(int j=0; j<rightSize; j++){
            rightSubArray[j] = A[mid + 1 + j];
        }

        int leftSubArrayIdx = 0, rightSubArrayIdx = 0;

        int k = left;

        while (leftSubArrayIdx < leftSize && rightSubArrayIdx < rightSize){
            if(leftSubArray[leftSubArrayIdx] <= rightSubArray[rightSubArrayIdx]){
                A[k] = leftSubArray[leftSubArrayIdx];
                leftSubArrayIdx++;
            }
            else{
                A[k] = rightSubArray[rightSubArrayIdx];
                rightSubArrayIdx++;
            }
            k++;
        }

        while(leftSubArrayIdx < leftSize){
            A[k] = leftSubArray[leftSubArrayIdx];
            leftSubArrayIdx++;
            k++;
        }

        while (rightSubArrayIdx < rightSize){
            A[k] = rightSubArray[rightSubArrayIdx];
            rightSubArrayIdx++;
            k++;
        }
    }

    public void sort(int[] A, int left, int right){

        if(left < right){

            int mid = (left + right)/2;

            sort(A, left, mid);
            sort(A, mid+1, right);

            merge(A, left, mid, right);
        }
    }

}
