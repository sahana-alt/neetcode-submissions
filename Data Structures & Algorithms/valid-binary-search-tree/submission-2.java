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
    public boolean isValidBST(TreeNode root) {

        //imp:- rtnge of min and max will hgelp

        //first approach is using helper fn and comparing values
        //dfs

        
    //     return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    // }
    // public boolean isValidBST(TreeNode node, int min, int max ) {

    //     if(node == null){
    //         return true;
    //     }

    //     if(node.val<=min || node.val>=max){
    //         return false;
    //     }

    //     return isValidBST(node.left,min, node.val) && isValidBST(node.right,node.val, max);
    
    //Iterative Dfs
        if(root == null){
            return true;
        }
        Stack<Pair<TreeNode,int []>> st = new Stack<>();    //imp dec

        st.push(new Pair<>(root, new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}));
        //impo push new pair
        while(!st.isEmpty()){
            Pair<TreeNode, int[]> pair = st.pop(); //imp dec
            TreeNode node = pair.getKey();
            int min = pair.getValue()[0];
            int maxi = pair.getValue()[1];      //imp getvalue

            if(node.val<=min || node.val >=maxi){
                return false;
            }

            if(node.left!=null){
                st.push(new Pair<>(node.left, new int[]{min, node.val}));
            }
            if(node.right!=null){
                st.push(new Pair<>(node.right,new int []{node.val, maxi}));
            }


        }

        return true;
        
    }
}
