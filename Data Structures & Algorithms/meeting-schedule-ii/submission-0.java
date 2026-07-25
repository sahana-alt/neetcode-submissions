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
    public int minMeetingRooms(List<Interval> intervals) {

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        //we need to sort based on starting order

        PriorityQueue<Integer> rooms = new PriorityQueue<>(); // end times

        for (Interval current : intervals) {
            if (!rooms.isEmpty() && current.start >= rooms.peek()) {
                rooms.poll(); // one meeting ended, reuse that room
            }

            rooms.offer(current.end);
        }

        return rooms.size();



    }
}
