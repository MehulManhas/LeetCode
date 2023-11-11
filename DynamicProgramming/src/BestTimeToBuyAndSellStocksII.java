public class BestTimeToBuyAndSellStocksII {
    public int maxProfit(final int[] A) {

        if(A.length == 0){
            return 0;
        }

        int profit = 0;

        for(int i=0; i<A.length-1; i++){
            if(A[i] < A[i+1]){
                profit += A[i+1] - A[i];
            }
        }

        return profit;
    }
    //TODO: Implement via memoization
}
