//https://leetcode.com/problems/time-needed-to-buy-tickets/?envType=daily-question&envId=2024-04-09
public class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        for(int i=0; i<tickets.length; i++){
            if(i<=k){
                time += Math.min(tickets[i], tickets[k]);
            }
            else{
                time+= Math.min(tickets[k]-1, tickets[i]);
            }
        }

        return time;
    }
}
