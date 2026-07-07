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
    public void reorderList(ListNode head) {
    //     ListNode fast= head.next,slow=head, list1=head;
    //     //problem on slow fast pointer and 
    //     //reversing & merging list

    //     while(slow!=null && fast!=null&& fast.next!=null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }

    //     ListNode list2 = slow.next,prev = null, temp;
    //     slow.next = null;
    //     while(list2!=null){
    //         //reversing logic
    //         temp = list2.next;
    //         list2.next = prev;
    //         prev = list2;
    //         list2 = temp;
    //     }
    //     // so prev will be the head of 
    //     //the head of the reversed list

    //     ListNode dummy = new ListNode(-1);
    //     ListNode cur = dummy; // imp:- cur and 
    //     //dummy ppoint to same node
        

    // while(list1 !=null  && prev!=null){
    //     //imp:- prev and l1 null check
    //     // merging 2 lists
    //     //imp:- u return void so u should 
    //     //do inpact merging

    //      ListNode temp1 = list1.next;
    // ListNode temp2 = prev.next;

    // list1.next = prev;
    // if (temp1 == null) break;
    // prev.next = temp1;

    // list1 = temp1;
    // prev = temp2;



    // }

    if(head == null || head.next == null){
        return;
    }

    ListNode slow = head, fast= head.next;

//find mid point
    while(slow!=null && fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }

    //reverse the second half and store in a list

    ListNode prev = null;
    ListNode cur2 = slow.next;
    slow.next = null; 

    while(cur2!=null){
        ListNode temp = cur2.next;
        cur2.next = prev;
        prev = cur2;
        cur2 = temp;
       
    }

   


 

    ListNode newList = head;
   ListNode second = prev;

   
  


        
        while (newList != null && second != null) {
            ListNode temp1 = newList.next;
            ListNode temp2 = second.next;

            newList.next = second;
            second.next = temp1;

            newList = temp1;
            second = temp2;
        }
 

  
    }
}
