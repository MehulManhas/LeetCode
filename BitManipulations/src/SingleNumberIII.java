public class SingleNumberIII {
    public int[] solve(int[] A) {
        return UniqueNumbers2(A, A.length);
    }
    public static int[] UniqueNumbers2(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {

            // Xor  all the elements of the array
            // all the elements occurring twice will
            // cancel out each other remaining
            // two unique numbers will be xored
            sum = (sum ^ arr[i]);
        }

        // Bitwise & the sum with it's 2's Complement
        // Bitwise & will give us the sum containing
        // only the rightmost set bit
        sum = (sum & -sum);

        // sum1 and sum2 will contains 2 unique
        // elements initialized with 0 box
        // number xored with 0 is number itself
        int sum1 = 0;
        int sum2 = 0;

        // traversing the array again
        for (int i = 0; i < arr.length; i++) {

            // Bitwise & the arr[i] with the sum
            // Two possibilities either result == 0
            // or result > 0
            if ((arr[i] & sum) > 0) {

                // if result > 0 then arr[i] xored
                // with the sum1
                sum1 = (sum1 ^ arr[i]);
            }
            else {
                // if result == 0 then arr[i]
                // xored with sum2
                sum2 = (sum2 ^ arr[i]);
            }
        }

        if(sum1 < sum2){
            return new int[]{sum1, sum2};
        }
        return new int[]{sum2, sum1};
    }
}
