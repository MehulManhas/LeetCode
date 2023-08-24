import java.util.Stack;

public class SortStackUsingAnotherStack {
    public SortStackUsingAnotherStack(){}

    public int[] solve(int[] A) {
        int n = A.length;

        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        for(int i : A){
            mainStack.push(i);
        }

        int element = mainStack.pop();

        tempStack.push(element);

        while (!mainStack.isEmpty()){
            int currentElement = mainStack.pop();

            while (!tempStack.isEmpty()){
                if(currentElement < tempStack.peek()){
                    int tempElement = tempStack.pop();
                    mainStack.push(tempElement);
                }
                else{
                    break;
                }
            }
            tempStack.push(currentElement);
        }

        for(int i=n-1; i>=0; i--){
            A[i] = tempStack.pop();
        }

        return A;
    }
}
