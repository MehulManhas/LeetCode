public class RainWaterTrapped {
    public int trap(final int[] A) {
        int[] leftToRightMax = new int[A.length];
        int[] rightToLeftMax = new int[A.length];
        int waterTrapped = 0;

        leftToRightMax[0] = A[0];

        for(int i=1; i<A.length; i++){
            leftToRightMax[i] = Math.max(leftToRightMax[i-1], A[i]);
        }

        rightToLeftMax[rightToLeftMax.length-1] = A[A.length-1];

        for(int i=A.length-2; i>=0; i--){
            rightToLeftMax[i] = Math.max(rightToLeftMax[i+1], A[i]);
        }

        for(int i=1; i<A.length-1; i++){
            int maxLeft = leftToRightMax[i-1];
            int maxRight = rightToLeftMax[i+1];
            int waterLevel = Math.min(maxLeft, maxRight);
            waterTrapped += Math.max(0, waterLevel - A[i]);
        }

        return waterTrapped;
    }
}
