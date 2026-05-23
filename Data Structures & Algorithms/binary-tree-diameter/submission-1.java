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
    public int diameterOfBinaryTree(TreeNode root) {
        //brute force is by ca;culated the ;eft height ,ax and right height 
        // max and adding them, - max diam throughtg root
        // we use maxh fn on left and rifhght , add them
        // for maxd of the subtree we do math.max diam of root left and righ
        //trgen max of sub and root passing diam
        // recursio stack iimp- example below
        // tc = o(n2) best is o(nlogn) for balanced tree
        // because u keep recalculating hright of subtree 
        // sc - recursion stalk takes h for best case a nd n - 
        //no of nodes worst case
        if(root==null){
            return 0;
        }

        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);
        int diam = lh+rh;  
        int sub =  Math.max(diameterOfBinaryTree(root.left), 
        diameterOfBinaryTree(root.right));

        return Math.max(sub, diam);

        
    }

    public int maxHeight(TreeNode root){
            if(root==null){
            return 0;
        }

        return 1+ Math.max(maxHeight(root.left), maxHeight(root.right));

        }
        
}
