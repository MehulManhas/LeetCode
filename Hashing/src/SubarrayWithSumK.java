import java.util.ArrayList;

public class SubarrayWithSumK{

    ArrayList<Integer> arr;
    int target = 0;

    public SubarrayWithSumK(){

    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        this.arr = A;
        this.target = B;


        int start = 0;
        int end = 0;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
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

        while(end < A.size()){
            if(sum < B){
                sum = sum + A.get(end);
                end++;
            }
            else if(sum > B){
                sum = sum - A.get(start);
                start++;
            }
            else{
                for(int i=start; i<end; i++){
                    ans.add(A.get(i));
                }
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}