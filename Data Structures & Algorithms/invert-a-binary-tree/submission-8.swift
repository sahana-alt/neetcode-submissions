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
    func invertTree(_ root: TreeNode?) -> TreeNode? {

        guard let root = root else {
            return nil
        }

        let left = root.right
        let right = root.left

        root.left = invertTree(left)
        root.right = invertTree(right)

        return root
            //or save left in temp and do root.left = invert tree
            //root.right
    }
}
