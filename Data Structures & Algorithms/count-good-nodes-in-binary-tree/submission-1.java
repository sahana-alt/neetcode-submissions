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
    public int goodNodes(TreeNode root) {
        //dfs, 
        return dfs(root,root.val);
        
    }

    public int dfs(TreeNode root, int maxSoFar){
        //maxsofar because its not just root, you will check even 
        // the ancestors

        int cnt=0;
        if(root==null){
            return 0;

        }

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            TreeNode node = st.pop();

            if(node.val>=maxSoFar){
                cnt+=1;
            }

            maxSoFar = Math.max(maxSoFar, node.val);
            cnt+= dfs(root.left, maxSoFar);
            cnt+= dfs(root.right, maxSoFar);

            
        }

        return cnt;
    }
}
