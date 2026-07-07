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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode head, tail;
        // if(list1==null){
        //     return list2;
        // } else if(list2 == null){
        //     return list1;
        // }
        // if(list1.val <= list2.val){
        //     head = tail = list1;
        //     list1= list1.next; //dont forget to move
        // }else{
        //     head = tail = list2;
        //     list2= list2.next;
        // }

        // while(list1!=null && list2!=null){
        //     if(list1.val <=list2.val){
        //     tail.next = list1;
        //     list1= list1.next;
        // }else{
        //     tail.next = list2; //imp:-tail.next
        //     list2= list2.next;
        // }
        // tail = tail.next; //imp
        // }
        
        // if(list1==null){
        //     tail.next=list2;
        // }else if(list2==null){
        //     tail.next = list1;
        // }
        // return head;

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        ListNode cur1 = list1;
        ListNode cur2 = list2;

        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        if(cur1.val<=cur2.val){
            dummy.next = cur1;
            cur1 = cur1.next;
           

        }else{
            dummy.next = cur2;
            cur2 = cur2.next;
           

        }
        dummy = dummy.next;

        while(cur1!=null && cur2!=null){
                if(cur1.val<=cur2.val){
                    dummy.next = cur1;
                    cur1 = cur1.next;

                }else{
                    dummy.next = cur2;
                    cur2 = cur2.next;

                }
                

                dummy = dummy.next;
              

        }

        if(cur1 == null){
            dummy.next = cur2;
        }else{
            dummy.next = cur1;
        }

        return head.next;


    }
}