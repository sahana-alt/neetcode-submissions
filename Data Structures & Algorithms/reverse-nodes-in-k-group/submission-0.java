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
    public ListNode reverseKGroup(ListNode head, int k) {

        List<Integer> l = new ArrayList<>();
        ListNode cur = head;
        int len = k;
        ListNode dummy = new ListNode(-1);
        ListNode newHead = dummy;

        while(cur!=null){
        l.add(cur.val);
        cur=cur.next;  
        } 

        int i=0;

        while(i<l.size()){

        if(i+k<=l.size()){  //imp<=
            for(int j=i+k-1;j>=i;j--){
                ListNode node = new ListNode(l.get(j));
                newHead.next = node;
                newHead = newHead.next;
            }

        } else{
            for(int j=i;j<l.size();j++){
                ListNode node = new ListNode(l.get(j));
                newHead.next = node;
                newHead = newHead.next;
            }
        }
        
            i+=k;
        }

           return dummy.next;  
        }
            
       
    


}
