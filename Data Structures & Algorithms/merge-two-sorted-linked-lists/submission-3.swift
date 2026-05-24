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

        while cur1 != nil && cur2 != nil {

            if cur1!.val <= cur2!.val {

                cur?.next = cur1
                cur1 = cur1?.next
                
                
            }else {
                cur?.next = cur2
                
                cur2 = cur2?.next
            }

            cur = cur?.next

        }

        if(cur1 == nil){
            cur?.next = cur2
        }
        if(cur2 == nil){
            cur?.next = cur1
        }

        return dummy?.next

    }
}
