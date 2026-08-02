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
    public boolean isBalanced(TreeNode root) {
        // did height of left tree and r tree , abs difference
        // if its >1 thrn returned false
        // else did the && check for isbalanced for l and r
        //tc - 0(n2)
        // sc = o(n) or o(h)
    //     if(root == null){
    //         return true;
    //     }

    //     int lh = height(root.left);
    //     int rh = height(root.right);
    //     int diff = Math.abs(lh-rh);
    //     if(diff>1){
    //         return false;
    //     }else{
    //         isBalanced(root.left);
    //         isBalanced(root.right);

    //     }
    //     return isBalanced(root.left) && isBalanced(root.right);
    //     //imp
    // }

    // public int height(TreeNode root){
    //     if(root==null){
    //         return 0;
    //     }

    //     return 1+Math.max(height(root.left), height(root.right));
    // }


    //2nd way 
    // do dfs as u do dfs if abs of lh-rh > 1 return -1
    // if lh or rh is -1 return  false or -1
    //so retutn =ing values and doing check
    int hDiff = heightValue(root);
    if(hDiff<0){
        return false;
    }
    return true;



     }

     int heightValue(TreeNode n){
        if(n==null){
            return 0;
        }
        int lh = heightValue(n.left);
        //this subtree is not balanced
        if (lh == -1) {
        return -1;
    }
        int rh = heightValue(n.right);
         //this subtree is not balanced
           if (rh == -1) {
        return -1;
    }

       
        if(Math.abs(lh-rh)>1){
            return -1;
        }

       
        return 1+Math.max(lh,rh);
     }
}
