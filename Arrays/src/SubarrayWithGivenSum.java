import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithGivenSum {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        int startIdx = 0;
        int endIdx = 0;
        int sum = 0;
        boolean sumFound = false;

        if(A.size() == 1 && A.get(0) == B){
                     return A;
        }
        else if(A.size() == 1 && A.get(0) != B){
             ans.add(-1);
             return ans;
        }
        if(A.size() == 2){
             if(A.get(0) == B){
                 ans.add(A.get(0));
                 return ans;
             }
             else if(A.get(1) == B){
                 ans.add(A.get(1));
                 return ans;
             }
             else if(A.get(0) + A.get(1) == B){
                 return A;
             }
             ans.add(-1);
             return ans;
        }

        while(endIdx < A.size()){
            if(sum < B){
                sum += A.get(endIdx);
                endIdx++;
            }
            else if(sum > B){
                sum -= A.get(startIdx);
                startIdx++;
            }
            else{
                break;
            }

            if(sum == B){
                sumFound = true;
                break;
            }
        }

        if(!sumFound){
            return new ArrayList<>(Arrays.asList(-1));
        }

        while (startIdx != endIdx){
            ans.add(A.get(startIdx++));
        }

        return ans;
    }
}
