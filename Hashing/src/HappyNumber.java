import java.util.HashSet;

public class HappyNumber {
    public HappyNumber(){}

    public boolean isHappy(int n) {
        HashSet<Long> nonRepeatingNums = new HashSet<>();
        long sum = n;

        while(sum != 1){

            sum = squareAndAdd(sum);

            if(sum == 1){
                break;
            }
            if(!nonRepeatingNums.contains(sum)){
                nonRepeatingNums.add(sum);
            }
            else if(nonRepeatingNums.contains(sum)){
                return false;
            }
        }
        return true;
    }
    public long squareAndAdd(long n){
        long sum = 0;
        while(n != 0){
            long currNum = n%10;
            long square = (long) Math.pow(currNum, 2);
            sum += square;
            n = n/10;
        }
        return sum;
    }
}
