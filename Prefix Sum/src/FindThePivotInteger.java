public class FindThePivotInteger {
    public int pivotInteger(int n) {
        int leftVal = 0;
        int rightVal = n;
        int leftSum = 0;
        int rightSum = 0;
        int itr = 0;

        while(itr <= n+1){
            if(leftSum < rightSum){
                leftSum += leftVal++;
            }
            else if(rightSum <= leftSum){
                rightSum += rightVal--;
            }

            itr++;
        }

        return leftSum == rightSum ? leftVal-1 : -1;
    }
}
