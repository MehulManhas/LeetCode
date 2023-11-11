public class PrimeModuloInverse {

    public int solve(int A, int B) {

        if(A == 0){
            return 0;
        }
        return calculate(A, B-2, B);
    }

    public int calculate(int a, int b, int c){

        if(b == 0){
            return 1;
        }

        long halfPower = calculate(a, b/2, c);
        long interimResult = halfPower % c * halfPower % c;

        return ((b%2 == 0) ? (int) ((interimResult) + c)% c : (int) ((interimResult * a % c) + c)%c);
    }
}
