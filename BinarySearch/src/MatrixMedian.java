public class MatrixMedian {
    public int findMedian(int[][] A) {
        int left = 1;
        int right = (int) Math.pow(10, 9);

        int totalNums = A.length*A[0].length;

        while(left <= right){
            int mid = (left+right)>>1;

            int count = 0;

            for(int i=0; i<A.length; i++){
                count += binarySearch(A[i], mid);
            }

            if(count <= totalNums/2){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }

    public int binarySearch(int[] A, int mid){

        int lenOfArr = A.length;

        if(mid > A[lenOfArr-1]){
            return  lenOfArr;
        }
        else if (mid < A[0]) {
            return 0;
        }
        else{
            int left = 0;
            int right = A.length-1;

            while(left <= right){
                int midIdx = (left+right)>>1;

                if(A[midIdx] <= mid){
                    left = midIdx+1;
                }
                else{
                    right = midIdx-1;
                }
            }
            return left;
        }
    }
}
