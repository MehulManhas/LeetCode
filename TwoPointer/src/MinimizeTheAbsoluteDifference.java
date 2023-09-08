import java.util.ArrayList;
public class MinimizeTheAbsoluteDifference {
    //https://www.scaler.com/academy/mentee-dashboard/class/35575/homework/problems/419/?navref=cl_pb_nv_tb
    public MinimizeTheAbsoluteDifference(){}

    public int solve(int[] A, int[] B, int[] C) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int difference = Integer.MAX_VALUE;

        int ptrA = 0;
        int ptrB = 0;
        int ptrC = 0;

        while((ptrA < A.length) && (ptrB < B.length) && (ptrC < C.length)){

            max = Math.max(A[ptrA], Math.max(B[ptrB], C[ptrC]));
            min = Math.min(A[ptrA], Math.min(B[ptrB], C[ptrC]));

            difference = Math.min(difference, Math.abs(max-min));

            if(A[ptrA] == min){
                ptrA++;
            }
            else if(B[ptrB] == min){
                ptrB++;
            }
            else{
                ptrC++;
            }

        }

        return difference;
    }
}
