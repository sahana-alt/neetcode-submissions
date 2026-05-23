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
        ListNode prev = new ListNode();
        ListNode cur;
        cur = head;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev.next;

            prev.next = cur;
            cur = temp;
        }
        return prev.next;
    }
}
