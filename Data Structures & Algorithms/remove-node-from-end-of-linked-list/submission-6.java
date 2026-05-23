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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head,tmp=null,prev = null;
        int c=0;

       

        while(cur!=null ){
            c++;
            cur=cur.next;
            
        }
        int st = c-n;

        //imp:-case
        if (c == n) {
            return head.next;
        }
       
        cur=head;

        for (int i = 1; i < st; i++) {
            cur = cur.next;
        }

        // Skip the nth node from end
        cur.next = cur.next.next;
               

        return head;
    }
}
