import java.util.Arrays;

public class Q8_MeetingInterval {
    public static boolean canAttendMeeting(int[][] intervals) {
        if(intervals == null || intervals.length == 0) {
            return true;
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int[] prev= intervals[0];
        for(int i=1; i<intervals.length; i++) {
            int[] curr = intervals[i];
            if(prev[1] > curr[0]) {
                return false;
            }
            prev = curr;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5,10}, {15,20}};
        System.out.println(canAttendMeeting(intervals));
    }
}
