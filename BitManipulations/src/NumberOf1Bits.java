//https://www.scaler.com/academy/mentee-dashboard/class/30018/homework/problems/192
public class NumberOf1Bits {
    public int numSetBits(int A) {
        int ans = 0;

        for(int i=0; i<31; i++){
            if((A&1) == 1){
                ans++;
            }

            A = A>>1;
        }

        return ans;
    }
}
