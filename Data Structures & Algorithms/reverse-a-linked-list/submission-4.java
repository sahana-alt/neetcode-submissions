/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur= head, prev = null;

        // imp:- return prev
        // so u will keep shifting the next like to the prev by 2
        // pointers us eprev = null, temp, cur = head
        // swap them keep makimg prev as cur and cur as cur.next
        
        // while(cur!=null){
        //     temp = cur.next;
        //     cur.next = prev;
        //     prev = cur;
        //     cur = temp;
            
        // }
        // return prev;

        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev=cur;
            cur = temp;
        }

        return prev;
    }
}
