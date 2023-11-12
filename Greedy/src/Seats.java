import java.util.ArrayList;

public class Seats {
    public int seats(String A) {

        ArrayList<Integer> seatPositions = new ArrayList<>();

        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == 'x'){
                seatPositions.add(i);
            }
        }

        if(seatPositions.isEmpty()){
            return 0;
        }

        int mod = (int) (Math.pow(10,7)+3);
        int median = (seatPositions.size()/2)+1;

        int minJumps = 0;
        int medianElement = seatPositions.get(median-1);

        int leftMedian = medianElement;

        for(int i=median-2; i>=0; i--){

            int jump = Math.abs(seatPositions.get(i) - leftMedian)-1;
            leftMedian = seatPositions.get(i) + jump;

            minJumps = (minJumps+jump)%mod;
        }

        int rightMedian = medianElement;

        for(int i=median; i<seatPositions.size(); i++){

            int jump = Math.abs(seatPositions.get(i) - rightMedian)-1;
            rightMedian = seatPositions.get(i) - jump;

            minJumps = (minJumps+jump)%mod;
        }

        return minJumps;
    }
}
