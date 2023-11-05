public class BestTimeToBuyAndSellStock {
    public int maxProfit(final int[] A) {

        if(A.length == 0){
            return 0;
        }

        int[] rightToLeftMax = new int[A.length];
        int max = Integer.MIN_VALUE;

        rightToLeftMax[A.length-1] = A[A.length-1];

        for(int i=A.length-2; i>=0; i--){
            rightToLeftMax[i] = Math.max(rightToLeftMax[i+1], A[i]);
        }

        for(int i=0; i<A.length; i++){
            max = Math.max(max, rightToLeftMax[i]-A[i]);
        }

        return max;
    }
}
