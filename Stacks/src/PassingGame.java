import java.util.Stack;

public class PassingGame {

    public PassingGame(){}

    public int solve(int A, int B, int[] C) {
        Stack<Integer> playerStack = new Stack<>();

        playerStack.add(B);

        int itr = 0;

        while (itr < A){
            if(C[itr] == 0){
                playerStack.pop();
            }
            else{
                playerStack.add(C[itr]);
            }
            itr++;
        }

        return playerStack.peek();
    }
}
