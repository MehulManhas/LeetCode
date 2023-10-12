//https://www.scaler.com/academy/mentee-dashboard/class/35569/assignment/problems/10863?navref=cl_tt_lst_nm

import java.util.ArrayList;

public class QuickSort {

    public int[] solve(int[] A) {

        quickSort(A, 0, A.length-1);

        return A;
    }

    public void quickSort(int[] A, int start, int end){

        if(start < end){

            int partition = rearrange(A, start, end);

            quickSort(A, start, partition-1);
            quickSort(A, partition + 1, end);
        }
    }

    public int rearrange(int[] A, int start, int end) {

        int pivot = A[end];

        int i = (start - 1);

        for(int j=start; j<=end; j++){

            if(A[j] < pivot){
                i++;
                swap(A, i, j);
            }
        }

        swap(A, i+1, end);
        return i+1;
    }

    public void swap(int[] A, int ptr1, int ptr2){
        int temp = A[ptr1];
        A[ptr1] = A[ptr2];
        A[ptr2] = temp;
    }
}
