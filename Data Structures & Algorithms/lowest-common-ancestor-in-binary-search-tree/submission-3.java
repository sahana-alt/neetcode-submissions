/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //easy way is get traversal from root to the node- dfs,
        // store in an array- 2 arrays
        // the val till u reach any node p or q that will be it
        // its the lca
        // but in this extra space and time
        
        // trabetrse beteeen both nodes, bottom up- dfs
        // if the node == root, return val
        // if null return null
        // if null and non null return non null val

        if(root == null || root.val == p.val || root.val == q.val){
            return root;
        }


        TreeNode leftNode = lowestCommonAncestor(root.left, p,q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p,q);

        // while coming up - do dry run
        if(leftNode == null){
            return rightNode;
        } else if(rightNode == null){
            return leftNode;
        } else{
            return root;
        }
     

        //tc = o(n) - we visit all nodes to get the return in botto. up
        // sc = rec stack o(h)

        //iterative approach without recursion
        //easy, 2 pointer, deciding where to go like binary search

        // TreeNode cur = root;

        // while(cur!=null){

        //     if(p.val >cur.val && q.val >cur. val){
        //         //its in right 
        //         cur = cur.right;
        //     }else if(p.val <cur.val && q.val <cur. val){
        //         cur = cur.left;
        //     }else{
        //         return cur;
        //     }
        // }
        
        // return null;

        
        


        
    }
}
