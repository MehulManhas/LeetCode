import java.util.Stack;

public class NextSmallerElement {
    public int[] prevSmaller(int[] A) {
        Stack<Integer> elements = new Stack<>();
        int[] ans = new int[A.length];

        for(int i=0; i<ans.length; i++){
            ans[i] = -1;
        }

        int i = 0;

        for(int element : A){
            while(!elements.isEmpty() && elements.peek() >= element){
                elements.pop();
            }
            if(!elements.isEmpty()){
                ans[i] = elements.peek();
            }
            else{
                ans[i] = -1;
            }
            elements.push(element);
            i++;
        }
        return ans;
    }
}
