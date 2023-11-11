//https://www.scaler.com/academy/mentee-dashboard/class/35561/assignment/problems/148/?navref=cl_pb_nv_tb

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3));
        Subset subset = new Subset();
        subset.subsets(A);

        NQueens nQueens = new NQueens();
        ArrayList<ArrayList<String>> ans = nQueens.solveNQueens(4);

        for(int i=0; i<ans.size(); i++){
            for (int j=0; j<ans.get(0).size(); j++){
                System.out.println(ans.get(i).get(j));
            }
            System.out.println();
        }
    }
}