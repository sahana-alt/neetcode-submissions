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

        //creare a list and add everything to the list
        //then maintain 1 index i loop that moves throught, 
        //update it by i+k
        // keep anothjer index j imp to start from i+k to j >=i, 
        //get that index of list and putto node
        // logic of dummy and cur
        // for i+k>size u do normal adding like j =i, to l.size()
        //if(i+k<=l.size()){  //imp<=
        //tc  and sc - o(n)

        // List<Integer> l = new ArrayList<>();
        // ListNode cur = head;
        // int len = k;
        // ListNode dummy = new ListNode(-1);
        // ListNode newHead = dummy;

        // while(cur!=null){
        // l.add(cur.val);
        // cur=cur.next;  
        // } 

        // int i=0;

        // while(i<l.size()){

        // if(i+k<=l.size()){  //imp<=
        //     for(int j=i+k-1;j>=i;j--){
        //         ListNode node = new ListNode(l.get(j));
        //         newHead.next = node;
        //         newHead = newHead.next;
        //     }

        // } else{
        //     for(int j=i;j<l.size();j++){
        //         ListNode node = new ListNode(l.get(j));
        //         newHead.next = node;
        //         newHead = newHead.next;
        //     }
        // }
        
        //     i+=k;
        // }

        //    return dummy.next;  
        // }      
    
    

    //tc = o(n) sc = o(1)
    //     ListNode dummy = new ListNode(-1,head); //imp:-
    //     ListNode groupPrev = dummy;
    //     ListNode groupNext,prev,cur,tmp;

    //     while(true){
    //         ListNode node = getNode(groupPrev,k);   //lastnode of group
    //         if(node==null){
    //             break;
    //         }
    //         groupNext = node.next;  // entire groups next

    //         //prev would be null while reversing but it should be k, next
    //         // groupPrev.next is first node

    //         prev= node.next;
    //         cur = groupPrev.next;

    //         //reversing list logic
    //         while(cur!=groupNext){
    //             tmp = cur.next;
    //             cur.next = prev;
    //             prev = cur;
    //             cur = tmp;
    //         }
            
    //         //imp
    //         tmp = groupPrev.next; // storing first node
    //         groupPrev.next =  node; // u want first node to be the last
    //         groupPrev = tmp; // update it to first


    //     }

    //    return dummy.next;

    // }

    //  ListNode getNode(ListNode cur,int k){
    //         //u return the list from this till k
    //         while(cur!=null && k>0){
    //             cur = cur.next;
    //             k-=1;
    //         }
    //         return cur;
    //     }

    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode groupPrev = dummy;
    
    ListNode cur = head,groupNxt;

    while(cur!=null){
        ListNode node = getLastNode(groupPrev.next,k);
        if(node == null){
            break;
        }

        groupNxt = node.next;
        ListNode prev = node.next;
        cur = groupPrev.next;

        while(cur!=groupNxt){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        ListNode oldStart = groupPrev.next;
        groupPrev.next = node;
        groupPrev = oldStart;
   
    }
    return dummy.next;
    }

    public ListNode getLastNode(ListNode cur, int k){
        while(k>1 && cur!=null){
            cur= cur.next;
            k-=1;
    
        }
        return cur;
    }
}
