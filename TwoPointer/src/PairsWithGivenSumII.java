import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class PairsWithGivenSumII{

    public int solve(int[] A, int B) {

        return optimized(A, B);
    }

    public int optimized(int[] A, int B){
        int leftPtr = 0;
        int rightPtr = A.length-1;
        long count = 0;
        long mod = (long) Math.pow(10,9)+7;

        while (leftPtr < rightPtr){

            int sum = A[leftPtr] + A[rightPtr];

            if(sum == B){

                if(A[leftPtr] == A[rightPtr]){

                    long duplicateCount = rightPtr - leftPtr + 1;
                    count += (duplicateCount * (duplicateCount-1))/2;
                    break;
                }

                int leftPointerAddition = findNextPointerForDuplicateElement(A, A[leftPtr], leftPtr, 'l');
                int rightPointerSubtraction = findNextPointerForDuplicateElement(A, A[rightPtr], rightPtr, 'r');

                count += ((long) leftPointerAddition * rightPointerSubtraction);

                leftPtr += leftPointerAddition;
                rightPtr -= rightPointerSubtraction;

            }
            else if(sum < B){
                leftPtr++;
            }
            else{
                rightPtr--;
            }
        }

        return (int) (count%mod);
    }

    public int findNextPointerForDuplicateElement(int[] A, int elementToFind, int pointer, char searchDirection){

        int frequency = 0;

        if(searchDirection == 'l'){
            while (A[pointer] == elementToFind){
                frequency++;
                pointer++;
            }
        }
        else if(searchDirection == 'r'){
            while (A[pointer] == elementToFind){
                frequency++;
                pointer--;
            }
        }

        return frequency;
    }

    public int bruteForce(int[] A, int B){
        int leftPtr = 0;
        int rightPtr = leftPtr+1;
        int rightPtrLimit = checkMaxRightLimit(A, B);
        int count = 0;

        if(rightPtrLimit < 0){
            return count;
        }

        while(leftPtr != rightPtrLimit){
            while (rightPtr != rightPtrLimit+1){
                if(leftPtr != rightPtr && A[leftPtr] + A[rightPtr] == B){
                    count++;

                }
                rightPtr++;
            }
            leftPtr++;
            rightPtr = leftPtr+1;
        }

        return count;
    }


    public int checkMaxRightLimit(int[] A, int B){
        int rightPtr = -1;
        for(int i=0; i<A.length; i++){
            if(A[i] <= B){
                rightPtr = i;
            }
            else{
                break;
            }
        }
        return rightPtr;
    }

}