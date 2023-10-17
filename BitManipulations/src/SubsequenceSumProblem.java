public class SubsequenceSumProblem {
    public int solve(int[] A, int B) {

        int ALength = A.length;

        for(int i=0; i<Math.pow(2, ALength); i++){

            int sum = 0;

            for(int bitPos=0; bitPos<ALength; bitPos++){

                if(((i>>bitPos) & 1 )== 1){
                    sum += A[bitPos];
                }
            }

            if(sum == B){
                return 1;
            }
        }

        return 0;
    }
}
