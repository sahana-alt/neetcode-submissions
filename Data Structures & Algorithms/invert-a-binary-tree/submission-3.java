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
    public TreeNode invertTree(TreeNode root) {
        //iteraive bfs
        // imp:- offer abd poll and q declaration as ll
        //tc and sc o(n);
            if(root==null){
            return null;
        } 
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if(node.right!=null){
                q.offer(node.right);
            }
             if(node.left!=null){
                q.offer(node.left);
            }
        }
        return root;

        //recursion and tmp switching tc and sc - o(n);
        // if(root==null){
        //     return null;
        // }
        // TreeNode tmp = root.left;
        // root.left = root.right;
        // root.right = tmp;

        // invertTree(root.left);
        // invertTree(root.right);

        // return root;

        
    }
}
