//https://www.scaler.com/academy/mentee-dashboard/class/35566/assignment/problems/15010?navref=cl_tt_lst_nm
import java.util.ArrayList;

public class TowerOfHanoi {

    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        Integer from_rod = 1;
        Integer aux_rod = 2;
        Integer to_rod = 3;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        toi(ans, A, from_rod, to_rod, aux_rod);

        return ans;

    }

    public void toi(ArrayList<ArrayList<Integer>> ans, int A, Integer from_rod, Integer to_rod, Integer aux_rod){

        if(A == 0){
            return;
        }

        toi(ans, A-1, from_rod, aux_rod, to_rod);

        ArrayList<Integer> subList = new ArrayList<>();

        subList.add(A);
        subList.add(from_rod);
        subList.add(to_rod);

        ans.add(subList);
        toi(ans, A-1, aux_rod, to_rod, from_rod);

    }
}
