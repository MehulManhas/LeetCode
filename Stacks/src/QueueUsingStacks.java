import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void enQueue(int val){

        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(val);

        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int deQueue(){
        if(s1.isEmpty()){
            return -1;
        }

        int val = s1.peek();
        s1.pop();

        return val;
    }

}
