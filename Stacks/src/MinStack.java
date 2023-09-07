import java.util.Stack;

public class MinStack {
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> currentStack = new Stack<>();
    public MinStack(){

    }

    public void push(int x) {
        if(minStack.isEmpty()){
            minStack.push(x);
            currentStack.push(x);
            return;
        }

        currentStack.push(x);

        if(x <= minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop() {

        if(!currentStack.isEmpty()){
            int current = currentStack.pop();
            if(current == minStack.peek()){
                minStack.pop();
            }
        }
    }

    public int top() {
        return currentStack.isEmpty() ? -1 : currentStack.peek();
    }

    public int getMin() {
        return minStack.isEmpty() ? -1 : minStack.peek();
    }
}
