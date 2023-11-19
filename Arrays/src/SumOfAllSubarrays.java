//https://www.scaler.com/academy/mentee-dashboard/class/30015/assignment/problems/14363
public class SumOfAllSubarrays {
    public long subarraySum(int[] A) {

        long finalSum = 0;

        for(int i=0; i<A.length; i++){
            long m1 = (long) (i+1);
            long m2 = (long) (A.length-i);
            long contribution = m1 * m2;
            finalSum += (long) A[i] * contribution;
        }

        return finalSum;
    }
}
