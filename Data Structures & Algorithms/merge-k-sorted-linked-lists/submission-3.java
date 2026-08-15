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

        //initial way is take all elements ass it to a list, create a
        // new ll from sorted values
        // if n is total elements the tc is nlogn and sc is o(n)
        //IMP:- Collections.sort(l);   imp   
        //ListNode cur = dummy; //imp not dummy next as its null

       
        // List<Integer> l = new ArrayList<>();

        // for(int i=0;i<lists.length;i++){
        //     ListNode ln = lists[i];
        //     while(ln!=null){
        //         l.add(ln.val);
        //         ln= ln.next;
        //     }
                
           


        // }

        // Collections.sort(l);   //imp

        // ListNode dummy = new ListNode(-1);
        // ListNode cur = dummy; //imp not dummy next as its null

        // for(int i:l){
        //     ListNode newNode = new ListNode(i);
        //     cur.next = newNode;
        //     cur=cur.next;
        // }
        // cur.next = null;
        // return dummy.next;

        //optimised way is to add all heads first to pq -minheap
        // this we do because we know lists are slorted
        //start creating  new ll with the minimum
        // then check if next is not null for the added nodes pointer
        // if its not null then add it toi the pq
        //IMP;- if u get runtime that means u aRE PUTTINF WHILE INSTSAED OF IF
        //SOMEWHERE
        //sc ansd tc


    //     class Pair {
    //         int key;
    //         ListNode node;

    //         Pair(int key, ListNode node) {
    //             this.key = key;
    //             this.node = node;
    //         }
    //     }

    //     PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.key-b.key);

    //     for(int i=0;i<lists.length;i++){
    //         if(lists[i]!=null){
    //             pq.add(new Pair(lists[i].val, lists[i]));
    //         }
            
    //     }

    //     ListNode dummy = new ListNode(-1);
    //     ListNode cur = dummy;

    //     while(!pq.isEmpty()){
         
    //         cur.next = pq.poll().node;  //already remoes
            
    //         cur=cur.next;
            
    //         if(cur.next!=null){ //its an if not while
    //             pq.add(new Pair(cur.next.val,cur.next));
    //         }
    //     }

    // return dummy.next;

    PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);

    //add the lowest in each list
    for(ListNode node: lists ){
        if(node!=null){
            pq.offer(node);
        }
    }

    ListNode dummy = new ListNode(-1);
    ListNode cur = dummy;

    while(!pq.isEmpty()){
        ListNode node = pq.poll();

        cur.next = node;
        cur = cur.next;

        if(node.next!=null){
            pq.add(node.next);
        }
    }

    return dummy.next;
    
    }
}
