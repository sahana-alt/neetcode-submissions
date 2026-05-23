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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        //so for this, preorders first will be root
        //get its index in inorder, u shpuld store inorder in map
        // then the left hand of this index will be inorder of the lsub
        // right same applies
        //so recursive call fns with this as new inorder and post order
        //watch striver do dry run u will undersdtand
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }

        return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1,mp);
       

 
       }

        public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder,int inStart, int inEnd, Map<Integer, Integer> mp){

            if(preEnd<preStart || inEnd<inStart)return null;
        
        TreeNode root = new TreeNode(preorder[preStart]);
        
        int inRoot = mp.get(preorder[preStart]);
        int numsleft = inRoot-inStart;
        

        root.left = buildTree(preorder, preStart+1,preStart+numsleft, inorder, inStart, inRoot-1,mp);
        root.right = buildTree(preorder, preStart+numsleft+1,preEnd, inorder, inRoot+1, inEnd,mp);
        
        return root;
        
       
        
    }
}
