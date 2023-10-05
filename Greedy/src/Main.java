public class Main {
    public static void main(String[] args) {
//        int[] ops = new int[]{1,1,1};
//        MinimumOperationsToMakeTheArrayIncreasing minimumOperationsToMakeTheArrayIncreasing = new MinimumOperationsToMakeTheArrayIncreasing();
//        System.out.println(minimumOperationsToMakeTheArrayIncreasing.minOperations(ops));

        int[] A = new int[]{1, 5, 7, 1};
        int[] B = new int[]{7, 8, 8, 8};
        FinishMaximumJobs finishMaximumJobs = new FinishMaximumJobs();
        System.out.println(finishMaximumJobs.solve(A, B));
    }
}