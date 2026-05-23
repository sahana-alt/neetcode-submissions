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
    public int maxDepth(TreeNode root) {
        //recursion
        // if(root==null){
        //     return 0;
        // }

        // return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
        


        //level order traversal
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        int level =0;
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
               
            }
             level++;
        }


    return level;
        // if(root==null){
        //     return 0;
        // }

        // Stack<TreeNode> st = new Stack<>();
        // int leftd=0,rightd = 0;
        // int maxd = 0;
        // st.push(root);
        


        // while(!st.isEmpty()){

        //     TreeNode node = st.pop();
        //     if(node.left!=null){
        //         leftd+=1;
              
        //         st.push(node.left);

        //     }
        //      if(node.right!=null){
        //         rightd+=1;
        //         st.push(node.right);

        //     }
        //     maxd = Math.max(leftd,rightd);
        // }
        
        //  return maxd+1;
        
    }
}
