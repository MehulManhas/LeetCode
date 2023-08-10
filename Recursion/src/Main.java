public class Main {
    public static void main(String[] args) {

        System.out.println(calcPow(3,3)%1);
    }

    public static int calcPow (int A, int B){
        if(B == 1){
            return A;
        }

        return calcPow(A, B-1)*A;
    }
}