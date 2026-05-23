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
    public List<List<Integer>> levelOrder(TreeNode root) {

        // dec size as it keeps changing
        // dont update node in if conditionds
        // use if and if not if and if else
         List<List<Integer>> lout = new ArrayList<>();
        if(root==null){
            return lout;
        }

        Queue<TreeNode> q = new ArrayDeque<>();
       
        q.offer(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            
            List<Integer> lin = new ArrayList<>();
            

            for(int i =0;i<size;i++){
                TreeNode node =  q.poll();
                lin.add(node.val);
                if(node.left!= null){
                    q.offer(node.left);
                   
                } 
                if(node.right!= null){
                    q.offer(node.right);
                 
                }
            
            }
         

            lout.add(lin);

        }

        return lout;
        
    }
}
