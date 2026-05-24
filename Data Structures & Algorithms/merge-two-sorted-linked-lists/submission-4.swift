/**
 * Definition for singly-linked list.
 * class ListNode {
 *     var val: Int
 *     var next: ListNode?
 *     init(_ val: Int) {
 *         self.val = val
 *         self.next = nil
 *     }
 * }
 */

class Solution {
    func mergeTwoLists(_ list1: ListNode?, _ list2: ListNode?) -> ListNode? {
        var cur1: ListNode? = list1
        var cur2: ListNode? = list2
        let dummy: ListNode? = ListNode(-1)
        var cur: ListNode? = dummy

       

            while let node1 = cur1, let  node2 = cur2{

                if node1.val <= node2.val{
                    cur?.next = node1
                    cur1 = node1.next
                } else{
                    cur?.next = node2
                    cur2 = node2.next
                }
                 cur = cur?.next
            }

            // if cur1!.val <= cur2!.val {

            //     cur?.next = cur1
            //     cur1 = cur1?.next
                
                
            // }else {
            //     cur?.next = cur2
                
            //     cur2 = cur2?.next
            // }

            // cur = cur?.next

        // }

        if(cur1 == nil){
            cur?.next = cur2
        }
        if(cur2 == nil){
            cur?.next = cur1
        }

        return dummy?.next

    }
}
