public class Main {
    public static void main(String[] args) {

//        System.out.println(calcPow(3,3)%1);
//
//        PowerOfThree powerOfThree = new PowerOfThree();
//        System.out.println(powerOfThree.isPowerOfThreeLog(27));
//        System.out.println(powerOfThree.isPowerOfThreeRecursion(27));
        int A = 2;
        GrayCode grayCode = new GrayCode();
        System.out.println(grayCode.grayCode(A));
    }

//    public static int calcPow (int A, int B){
//        if(B == 1){
//            return A;
//        }
//
//        return calcPow(A, B-1)*A;
//    }
}