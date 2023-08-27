import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        KPlacesApart kPlacesApart = new KPlacesApart();
//
//        int[] A = new int[]{1,4,6,3,9,10};
//        int B = 4;
//        A = kPlacesApart.solve(A, B);
//
//        for(int i : A){
//            System.out.println(i);
//        }


        int[] B = new int[]{1,2,3,4,5,6};
        int A = 4;
        AthLargestElement athLargestElement = new AthLargestElement();
        B = athLargestElement.solve(A, B);

        for(int i : B){
            System.out.println(i);
        }

//        int[] arr = new int[]{2, 1, 4, 3, 2};
//        List<Integer> A = new ArrayList<>();
//
//        for(int i : arr){
//            A.add(i);
//        }
//
//        int B = 3;
//
//        KthSmallestElement kthSmallestElement = new KthSmallestElement();
//        System.out.println(kthSmallestElement.kthsmallest(A, B));
    }
}