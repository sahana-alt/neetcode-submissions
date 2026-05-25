/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     var val: Int
 *     var left: TreeNode?
 *     var right: TreeNode?
 *     init(_ val: Int) {
 *         self.val = val
 *         self.left = nil
 *         self.right = nil
 *     }
 * }
 */

class Solution {
    func isValidBST(_ root: TreeNode?) -> Bool {
        
        return isValidBSTsearch(root, Int.min, Int.max)
    }

    func isValidBSTsearch(_ root: TreeNode?,_ min: Int,_ max:Int) -> Bool{

        guard let root = root else{
            return true
        }

        let val = root.val
        if val <= min || val >= max {

            return false

        }

        return isValidBSTsearch(root.left, min, val)
        && isValidBSTsearch(root.right, val, max)
    }


}
