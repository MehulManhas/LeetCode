
//https://www.scaler.com/academy/mentee-dashboard/class/35563/session?navref=cl_tb_br
public class DivisorGame {

    public int solve(int A, int B, int C) {

        int gcd = GCD(B, C);
        int lcm = (B*C) / gcd;
        int ans = A/lcm;

        return ans;

    }

    int GCD(int B, int C)
    {
        if(B == 0) return C;
        if(C == 0) return B;
        return GCD(C, B%C);
    }
}
