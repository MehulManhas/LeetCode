//https://www.scaler.com/academy/mentee-dashboard/class/35566/assignment/problems/145/?navref=cl_pb_nv_tb
import java.util.ArrayList;

public class GrayCode {
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> grayCode(int A) {

        if(A == 1){
            list.add(0);
            list.add(1);
            return list;
        }

        grayCode(A-1);

        for(int i=list.size()-1; i>=0; i--){
            int temp = (list.get(i) | 1<<(A-1));
            list.add(temp);
        }

        return list;
    }

}
