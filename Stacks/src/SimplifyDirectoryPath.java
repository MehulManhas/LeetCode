//https://www.scaler.com/academy/mentee-dashboard/class/40034/assignment/problems/51/?navref=cl_pb_nv_tb

import java.util.ArrayList;
import java.util.Stack;

public class SimplifyDirectoryPath {
    public String simplifyPath(String A) {
        Stack<String> dirStack = new Stack<>();
        String[] dirs = A.split("/");

        for(String symbol : dirs){
            if(!dirStack.isEmpty() && symbol.equals("..")){
                dirStack.pop();
            }
            else if(!symbol.equals("..") && !symbol.equals(".") && symbol.length() != 0){
                dirStack.add(symbol);
            }
        }

        ArrayList<String> ans = new ArrayList<>(dirStack);

        return "/" + String.join("/", ans);
    }
}
