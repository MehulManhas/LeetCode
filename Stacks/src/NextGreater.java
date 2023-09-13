import java.util.ArrayList;
import java.util.Stack;

public class NextGreater {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        Stack<Integer> greaterToRight = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<A.size(); i++){
            ans.add(i, -1);
        }

        greaterToRight.add(A.get(A.size()-1));

        for(int i=A.size()-1; i>=0; i--){

            int element = A.get(i);

            while (greaterToRight.size() > 0 && greaterToRight.peek() <= element){
                greaterToRight.pop();
            }

            if(greaterToRight.size() == 0){
                ans.set(i, -1);
            }
            else{
                ans.set(i, greaterToRight.peek());
            }

            greaterToRight.add(A.get(i));
        }

        return ans;
    }
}
