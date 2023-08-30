public class PowerOfThree {

    public PowerOfThree(){

    }

    public boolean isPowerOfThreeLog(int n) {
        return (Math.log10(n)/Math.log10(3))%1 == 0;
    }

    public boolean isPowerOfThreeRecursion(int n) {
        if(n == 1){
            return true;
        }

        if(n <= 0 || n%3 != 0){
            return false;
        }
        return isPowerOfThreeRecursion(n/3);
    }
}
