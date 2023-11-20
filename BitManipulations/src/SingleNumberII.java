public class SingleNumberII {
    public int singleNumber(final int[] A) {
        int uniqueElement = 0;

        for(int i=0; i<31; i++){
            int countOfSetBits = 0;
            for(int j=0; j<A.length; j++){

                if(checkBit(A[j], i)){
                    countOfSetBits++;
                }
            }

            if(countOfSetBits % 3 == 1){
                uniqueElement = uniqueElement + (1 << i);
            }
        }

        return uniqueElement;
    }

    public boolean checkBit(int num, int i){
        num = num >> i;
        if((num & 1) == 1){
            return true;
        }
        return false;
    }

}
