//https://www.scaler.com/academy/mentee-dashboard/class/35563/assignment/problems/9104/?navref=cl_pb_nv_tb
import java.util.ArrayList;

public class Pubg {

    public int solve(ArrayList<Integer> A) {
        int ans = A.get(0);

        for(int i=0; i<A.size(); i++){
            ans = gcd(ans, A.get(i));
        }

        return ans;
    }

    public int gcd(int A, int B){
        if(B==0){
            return A;
        }

        return gcd(B, A%B);
    }
}
