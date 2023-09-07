import java.util.Stack;

public class MinStack {
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> currentStack = new Stack<>();
    public MinStack(){

    }

    public void push(int x) {
        if(minStack.empty()){
            minStack.push(x);
        }
        else if(minStack.peek() >= x){
            minStack.push(x);
        }
        currentStack.push(x);
    }

    public void pop() {
        if(currentStack.isEmpty()){
            return;
        }
        if(minStack.peek() == currentStack.peek()){
            minStack.pop();
            currentStack.pop();
        }
        else if(minStack.peek() != currentStack.pop()){
            currentStack.pop();
        }
    }

    public int top() {
        return currentStack.isEmpty() ? -1 : currentStack.peek();
    }

    public int getMin() {
        return minStack.isEmpty() ? -1 : minStack.peek();
    }
}
