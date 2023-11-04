import java.util.ArrayList;
import java.util.Arrays;
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


//        int[] B = new int[]{1,2,3,4,5,6};
//        int A = 4;
//        AthLargestElement athLargestElement = new AthLargestElement();
//        B = athLargestElement.solve(A, B);
//
//        for(int i : B){
//            System.out.println(i);
//        }

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

//        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
//
//        A.add(0, new ArrayList<>(Arrays.asList(1,-1)));
//        A.add(1, new ArrayList<>(Arrays.asList(2,-1)));
//
//        int B = 1;
//
//
//        BClosestPointsToOrigin bClosestPointsToOrigin = new BClosestPointsToOrigin();
//
//        ArrayList<ArrayList<Integer>> ans = bClosestPointsToOrigin.solve(A, B);
//
//        for(ArrayList<Integer> pair : ans){
//            System.out.print(pair.get(0)+" "+pair.get(1));
//            System.out.println();
//        }
        int A = 100;
        WaysToFormMaxHeap waysToFormMaxHeap = new WaysToFormMaxHeap();
        System.out.println(waysToFormMaxHeap.solve(100));

    }
}