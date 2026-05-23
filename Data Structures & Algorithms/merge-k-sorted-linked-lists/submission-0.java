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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> l = new ArrayList<>();

        for(int i=0;i<lists.length;i++){
            ListNode ln = lists[i];
            while(ln!=null){
                l.add(ln.val);
                ln= ln.next;
            }
                
           


        }

        Collections.sort(l);   //imp

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy; //imp not dummy next as its null

        for(int i:l){
            ListNode newNode = new ListNode(i);
            cur.next = newNode;
            cur=cur.next;
        }
        cur.next = null;
        return dummy.next;

    }
}
