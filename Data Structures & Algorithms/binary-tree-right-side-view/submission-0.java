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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        int level = 0;
        res = rightExtremes(root,res,level);
        return res;
    }

    public List<Integer> rightExtremes(TreeNode root, List<Integer> res, int level){
        if(root == null){
            return new ArrayList<>();
        }

        if(level == res.size()){
                res.add(root.val);
        }

        rightExtremes(root.right,res,level+1);
        rightExtremes(root.left,res,level+1);

        return res;
    }
}
