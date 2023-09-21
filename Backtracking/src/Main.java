//https://www.scaler.com/academy/mentee-dashboard/class/35561/assignment/problems/148/?navref=cl_pb_nv_tb

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3));
        Subset subset = new Subset();
        subset.subsets(A);
    }
}