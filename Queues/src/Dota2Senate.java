//https://leetcode.com/problems/dota2-senate/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();

        for(int i=0; i<senate.length(); i++){
            if(senate.charAt(i) == 'R'){
                radiantQueue.add(i);
            }
            else{
                direQueue.add(i);
            }
        }

        while(!radiantQueue.isEmpty() && !direQueue.isEmpty()){

            int radiantTurn = radiantQueue.poll();
            int direTurn = direQueue.poll();

            if(direTurn < radiantTurn){
                direQueue.add(direTurn + n);
            }
            else{
                radiantQueue.add(radiantTurn + n);
            }
        }

        return radiantQueue.isEmpty() ? "Dire" : "Radiant";
    }
}
