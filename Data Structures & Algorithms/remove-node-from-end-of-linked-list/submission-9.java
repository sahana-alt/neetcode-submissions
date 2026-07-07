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
        // ListNode cur = head,tmp=null,prev = null;
        // int c=0;

       

        // while(cur!=null ){
        //     c++;
        //     cur=cur.next;
            
        // }
        // int st = c-n;

        // //imp:-case
        // if (c == n) {
        //     return head.next;
        // }
       
        // cur=head;

        // for (int i = 1; i < st; i++) {
        //     cur = cur.next;
        // }

        // // Skip the nth node from end
        // cur.next = cur.next.next;
               

        // return head;

        ListNode cur = head;

        if(head == null || n==0){
            return head;
        }

        int cnt = 0;
        while(cur!=null){
            cur=cur.next;
            cnt++;
        }
        //  System.out.println(cnt);

        int pos = cnt-n+1;

        if (pos == 1) {
            return head.next;
        }
        System.out.println(pos);
        ListNode prev = null;

        ListNode cur1 = head;
        int cnt2 = 1;
        while(cur1!=null){

            prev= cur1; 
           

           
            cur1=cur1.next;
            cnt2++;

             if(cnt2==pos){       
                break;
            }
 
        }

        
      
        ListNode delNode = prev.next;

        if(delNode !=null && delNode.next!=null){
            prev.next = delNode.next;
        }else{
            prev.next = null;
        }

        return head;

        
    }
}
