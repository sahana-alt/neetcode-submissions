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

        //recurvidve way

        // int cnt=0;
        // if(root==null){
        //     return 0;

        // }

        // Stack<TreeNode> st = new Stack<>();
        // st.push(root);

        // while(!st.isEmpty()){
        //     TreeNode node = st.pop();

        //     if(node.val>=maxSoFar){ //imp
        //         cnt+=1;
        //     }

        //     maxSoFar = Math.max(maxSoFar, node.val);
        //     cnt+= dfs(root.left, maxSoFar); //imp
        //     cnt+= dfs(root.right, maxSoFar);

            
        // }

        // return cnt;


        //iterative way
        if(root==null){
            return 0;
        }

        Stack<Pair<TreeNode, Integer>> st = new Stack<>();
        int cnt =0;
        st.push(new Pair<>(root,root.val));

         while(!st.isEmpty()){
            Pair<TreeNode,Integer> pair = st.pop();
            TreeNode node = pair.getKey();
            Integer maxsoFar = pair.getValue();

            if(node.val>=maxsoFar){
                cnt+=1;
            }

            maxsoFar = Math.max(node.val,maxsoFar);
            if (node.left != null) st.push(new Pair<>(node.left, maxsoFar));
            if (node.right != null) st.push(new Pair<>(node.right, maxsoFar));





         }
         return cnt;
    }
}
