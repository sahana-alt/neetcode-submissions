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
    func maxDepth(_ root: TreeNode?) -> Int {

        guard let root = root else{
            return 0
        }

        // return 1+max(maxDepth(root.left),maxDepth(root.right))

        var queue:[TreeNode?] = []

        queue.append(root)

        var level = 0

        while !queue.isEmpty{

            var size = queue.count
            

            for _ in 0..<size{

                var node = queue.removeFirst()

                if(node?.left != nil){
                    queue.append(node?.left)
                    
                }
                
                if(node?.right != nil){
                    queue.append(node?.right)
                    

                }
            }

            level += 1
        }

        return level
    }
}
