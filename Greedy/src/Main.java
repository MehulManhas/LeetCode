import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        int[] ops = new int[]{1,1,1};
//        MinimumOperationsToMakeTheArrayIncreasing minimumOperationsToMakeTheArrayIncreasing = new MinimumOperationsToMakeTheArrayIncreasing();
//        System.out.println(minimumOperationsToMakeTheArrayIncreasing.minOperations(ops));

//        int[] A = new int[]{1, 5, 7, 1};
//        int[] B = new int[]{7, 8, 8, 8};
//        FinishMaximumJobs finishMaximumJobs = new FinishMaximumJobs();
//        System.out.println(finishMaximumJobs.solve(A, B));

//        ArrayList<Integer> A = new ArrayList<>(List.of(1, 3, 2, 3, 3));
//        ArrayList<Integer> B = new ArrayList<>(List.of(5, 6, 1, 3, 9));
//
//        FreeCars freeCars = new FreeCars();
//        System.out.println(freeCars.solve(A, B));

//        ArrayList<Integer> A1 = new ArrayList<>(List.of(3, 8, 7, 5));
//        ArrayList<Integer> B1 = new ArrayList<>(List.of(3, 1, 7, 19));
//
//        FreeCars freeCars1 = new FreeCars();
//        System.out.println(freeCars1.solve(A1, B1));
//
//        String A = "xxx....x";
//        Seats seats = new Seats();
//        System.out.println(seats.seats(A));

        int[][] a = new int[][]{{7,10},{2,7}, {2,4}, {1,3}};
        MeetingRoomsII meetingRoomsII = new MeetingRoomsII();
        meetingRoomsII.minMeetingRooms(a);
    }
}