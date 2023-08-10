public class Main {
    public static void main(String[] args) {
//        ReversePolishNotation rpn = new ReversePolishNotation();
//        String[] quest1 = new String[]{"2","1","+","3","*"};
//
//        System.out.print(rpn.evalRPN(quest1));

//        BaseBallGame bbg = new BaseBallGame();
//        String[] quest2 = new String[]{"5","2","C","D","+"};
//        System.out.println(bbg.calPoints(quest2));

        NextSmallerElement nse = new NextSmallerElement();
        int[] quest3 = new int[]{ 34, 35, 27, 42, 5, 28, 39, 20, 28 };


        System.out.println(nse.prevSmaller(quest3));
    }
}