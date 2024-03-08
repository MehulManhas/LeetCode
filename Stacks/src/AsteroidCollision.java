//https://leetcode.com/problems/asteroid-collision/?envType=study-plan-v2&envId=leetcode-75
import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<asteroids.length; i++){
            if(stack.isEmpty()){
                stack.push(asteroids[i]);
            }
            else{
                boolean toBeAddedToStack = true;

                while(!stack.isEmpty() && stack.peek() >= 0 && asteroids[i] <= 0){
                    if(stack.peek() < Math.abs(asteroids[i])){
                        stack.pop();
                    }
                    else if(stack.peek() == Math.abs(asteroids[i])){
                        stack.pop();
                        toBeAddedToStack = false;
                        break;
                    }
                    else if(stack.peek() > Math.abs(asteroids[i])){
                        toBeAddedToStack = false;
                        break;
                    }
                }
                if(toBeAddedToStack){
                    stack.push(asteroids[i]);
                }
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

}
