import java.util.ArrayList;
import java.util.Collections;

public class BoringSubstring {
    public int solve(String A) {

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for(Character c : A.toCharArray()){
            int asciiValue = c;

            if(asciiValue%2 == 0){
                evenList.add(asciiValue);
            }
            else{
                oddList.add(asciiValue);
            }
        }

        Collections.sort(evenList);
        Collections.sort(oddList);

        if(Math.abs(evenList.get(evenList.size()-1) - oddList.get(0)) != 1){
            return 1;
        }

        if(Math.abs(oddList.get(oddList.size()-1) - evenList.get(0)) != 1){
            return 1;
        }

        return 0;

    }
}
