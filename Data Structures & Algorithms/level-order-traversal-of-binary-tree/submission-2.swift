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
    func levelOrder(_ root: TreeNode?) -> [[Int]] {

        guard let root = root else{
            return []
        }

        var q: [TreeNode?] = []
        var res = Array<Array<Int>>()

        q.append(root)

        while !q.isEmpty{
            var size = q.count
            var list:[Int] = []
            for i in 0..<size{
               

                
                var node = q.removeFirst()

                if let value = node?.val{
                    list.append(value)
                }
               
                

                if(node?.left != nil){
                    q.append(node?.left)
                }
                if(node?.right != nil){
                    q.append(node?.right)
                }
            }
            res.append(list)
        }

        return res



    }
}
