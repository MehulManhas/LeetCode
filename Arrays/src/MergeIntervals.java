import java.util.ArrayList;

public class MergeIntervals {


    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> ans = new ArrayList<>();

        for(int i=0; i<intervals.size(); i++){
            Interval currentInterval = intervals.get(i);

            if(newInterval.start > currentInterval.end){
                ans.add(currentInterval);
            }
            else if(currentInterval.start > newInterval.end){
                ans.add(newInterval);

                for(int j=i; j<intervals.size(); j++){
                    ans.add(intervals.get(j));
                }

                return ans;
            }
            else{
                newInterval.start = Math.min(newInterval.start, currentInterval.start);
                newInterval.end = Math.max(newInterval.end, currentInterval.end);
            }
        }

        ans.add(newInterval);
        return ans;
    }
}
