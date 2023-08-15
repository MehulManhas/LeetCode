

public class BestTimeToBuyAndSellStocks {

    public BestTimeToBuyAndSellStocks(){

    }

    int[] maxArr;
    int[] minArr;

    public int maxProfit(final int[] A) {

        if(A.length == 0){
            return 0;
        }

        maxArr = new int[A.length];
        minArr = new int[A.length];
        setMaxArr(A);
        setMinArr(A);


        return  findMaxProfit(A);
    }

    public void setMaxArr(int[] A){

        int currMax = Integer.MIN_VALUE;

        for(int i=A.length-1; i>=0; i--){
            currMax = Math.max(currMax, A[i]);
            maxArr[i] = currMax;
        }
    }

    public void setMinArr(int[] A){

        int currMin = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++){
            currMin = Math.min(currMin, A[i]);
            minArr[i] = currMin;
        }
    }

    public int findMaxProfit(int[] A){

        int finalMaxValue = -1;

        for(int i=0; i<A.length; i++){

            finalMaxValue = Math.max(finalMaxValue, maxArr[i]-A[i]);
        }
        return finalMaxValue;
    }
}
