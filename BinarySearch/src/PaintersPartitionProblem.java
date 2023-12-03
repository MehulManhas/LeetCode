public class PaintersPartitionProblem {
    public int paint(int A, int B, int[] C) {
        long[] maxAndSum = getMaxAndSum(C, B);
        long left = maxAndSum[0];
        long right = maxAndSum[1];
        long ans = Long.MAX_VALUE;

        while (left <= right){
            long mid = (right+left)/2;

            if(check(mid, A, B, C)){
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return (int) (ans % 10000003);
    }
    public boolean check(long mid, int painters, long time, int[] task){
        int noOfPainters = 1;
        long sum = 0;

        for(int i=0; i<task.length; i++){
            sum += (task[i] * time);

            if(sum > mid){
                noOfPainters++;
                sum = task[i] * time;
                if(noOfPainters > painters){
                    return false;
                }
            }
        }

        return true;
    }
    public long[] getMaxAndSum(int[] boards, int timeTaken){
        long max = Long.MIN_VALUE;
        long sum = 0;

        for(int board : boards){
            sum += board;
            max = Math.max(board, max);
        }

        return new long[]{max * timeTaken, sum * timeTaken};
    }
}
