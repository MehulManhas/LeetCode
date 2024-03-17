//https://leetcode.com/problems/meeting-rooms-ii/submissions/1206429482/?envType=weekly-question&envId=2024-03-15
import java.util.*;

public class MeetingRoomsII {
    public class meetingComparator implements Comparator<Object> {

        @Override
        public int compare(Object o1, Object o2) {
            int[] arr1 = (int[]) o1;
            int[] arr2 = (int[]) o2;
            if(arr1[0] == arr2[0]){
                return arr1[1]-arr2[1];
            }
            return arr1[0] - arr2[0];
        }
    }
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, new meetingComparator());
        PriorityQueue<Integer> meetingRooms = new PriorityQueue<>();

        for(int i=0; i<intervals.length; i++){
            if(!meetingRooms.isEmpty() && meetingRooms.peek() <= intervals[i][0]){
                meetingRooms.poll();
            }
            meetingRooms.offer(intervals[i][1]);
        }


        return meetingRooms.size();
    }
}
