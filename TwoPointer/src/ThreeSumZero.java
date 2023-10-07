import java.util.*;

public class ThreeSumZero {
    public ThreeSumZero(){

    }

    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {

        Collections.sort(A);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int leftPtr = 0; leftPtr < A.size(); leftPtr++){

            if(leftPtr > 0 && A.get(leftPtr).equals(A.get(leftPtr-1))){
                continue;
            }

            int middlePtr = leftPtr + 1;
            int rightPtr = A.size()-1;

            while(middlePtr < rightPtr){

                int sum = A.get(leftPtr) + A.get(middlePtr) + A.get(rightPtr);

                if(sum == 0){

                    ArrayList<Integer> row = new ArrayList<>();

                    row.add(A.get(leftPtr));
                    row.add(A.get(middlePtr));
                    row.add(A.get(rightPtr));

                    ans.add(row);

                    int x = A.get(middlePtr);

                    while (middlePtr < rightPtr && A.get(middlePtr) == x){
                        middlePtr++;
                    }

                    int y = A.get(rightPtr);

                    while (middlePtr < rightPtr && A.get(rightPtr) == y){
                        rightPtr--;
                    }
                }
                else if(sum < 0){
                    middlePtr++;
                }
                else{
                    rightPtr--;
                }
            }
        }
        return ans;
    }
}
