import java.util.Stack;

public class ReversePolishNotation {
    Stack<String> stack = new Stack<>();
    public int evalRPN(String[] A) {


        for(int i=0; i<A.length; i++){
            if(A[i].equals("+") || A[i].equals("-") || A[i].equals("*") || A[i].equals("/")){
                stack.push(Integer.toString(checkOperator(A[i])));
            }
            else{
                stack.push(A[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }
    public int checkOperator(String op){
        int num2 = Integer.parseInt(stack.pop());
        int num1 = Integer.parseInt(stack.pop());

        if(op.equals("+")){
            return add(num1, num2);
        }
        else if(op.equals("-")){
            return subtract(num1, num2);
        }
        else if(op.equals("*")){
            return multiply(num1, num2);
        }
        else if(op.equals("/")){
            return divide(num1, num2);
        }
        return -1;
    }
    public int add(int num1, int num2){
        return num1+num2;
    }
    public int subtract(int num1, int num2){
        return num1-num2;
    }
    public int multiply(int num1, int num2){
        return (int) (num1 * num2);
    }
    public int divide(int num1, int num2){
        return (int) (num1/num2);
    }
}
