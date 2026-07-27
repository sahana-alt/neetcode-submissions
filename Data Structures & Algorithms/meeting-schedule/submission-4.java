/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        if(intervals.size()==0) return true;

        intervals.sort((a,b)->a.start-b.start);
        int n = intervals.size();

        int cnt = 1;
        int lastTime = intervals.get(0).end;

        for(int i = 1;i<n;i++){
        
            if(intervals.get(i).start>=lastTime){
                cnt+=1;
                lastTime = intervals.get(i).end;

            }

        }

        if(cnt == n)    return true;

        return false;



    }
}
