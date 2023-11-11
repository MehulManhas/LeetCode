public class SpecialIndex {

    public int solve(int[] A){

        int n = A.length;

        int[] evenPrefixSum = new int[n];

        evenPrefixSum[0] = A[0];

        for (int i=1; i<n; i++){
            if(i%2 == 0){
                evenPrefixSum[i] = evenPrefixSum[i-1] + A[i];
            }
            else {
                evenPrefixSum[i] = evenPrefixSum[i-1];
            }
        }

        int[] oddPrefixSum = new int[n];
        oddPrefixSum[0] = 0;

        for(int i=1; i<n; i++){
            if(i%2 != 0){
                oddPrefixSum[i] = oddPrefixSum[i-1] + A[i];
            }
            else {
                oddPrefixSum[i] = oddPrefixSum[i-1];
            }
        }

        int sumEven = 0;
        int sumOdd = 0;
        int count = 0;

        for(int i=0; i<n; i++){

            if(i==0){
                sumEven = oddPrefixSum[n-1] - oddPrefixSum[i];
                sumOdd = evenPrefixSum[n-1] - evenPrefixSum[i];
            }
            else {
                sumEven = evenPrefixSum[i-1] + oddPrefixSum[n-1] - oddPrefixSum[i];
                sumOdd = oddPrefixSum[i-1] + evenPrefixSum[n-1] - evenPrefixSum[i];
            }

            if(sumOdd == sumEven){
                count++;
            }
        }

        return count;
    }
}
