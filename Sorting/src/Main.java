import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] A = new int[]{5, 3, 1, 9, 4};
//        CountSwapsInInsertionSortII countSwapsInInsertionSortII = new CountSwapsInInsertionSortII();
//        System.out.println(countSwapsInInsertionSortII.solve(A));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(6, 8, 9));
//        FactorsSort factorsSort = new FactorsSort();
//        System.out.println(factorsSort.solve(A));

        int[] A = new int[]{12, 11, 13, 5, 6, 7};
        MergeSort mergeSort = new MergeSort();
        int[] ans = mergeSort.solve(A);

        for(int i : A){
            System.out.print(i + " ");
        }
    }
}