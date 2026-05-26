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

class Codec {
    // Encodes a tree to a single string.
    func serialize(_ root: TreeNode?) -> String {

        var q : [TreeNode?] = []
        var res: [String] = []

        if root == nil{
            return " "
        }

        q.append(root)

        while !q.isEmpty {

            let node = q.removeFirst()

            guard let node = node else {
                res.append("n")
                continue
            }

            res.append(String(node.val))
            q.append(node.left)
            q.append(node.right)

        }

        return res.joined(separator: ",")

    }

    // Decodes your encoded data to tree.
    func deserialize(_ data: String) -> TreeNode? {

        if data == " "{
            return nil
        }

        let chars: [String] = Array(data.split(separator: ",").map { String($0) })


        var q : [TreeNode?] = []
        let first = TreeNode(Int(chars[0])!)
        q.append(first)

        var i = 1

      while i < chars.count && !q.isEmpty  {

            guard let root = q.removeFirst() else {
                return nil
            }

            if chars[i] != "n" {
                let leftNode = TreeNode(Int(chars[i])!)
                root.left = leftNode
                q.append(leftNode)
            }

            i += 1

            if i < chars.count && chars[i] != "n" {
                let rightNode = TreeNode(Int(chars[i])!)
                root.right = rightNode
                q.append(rightNode)
            }

            i += 1

        }
        return first

    }
}
