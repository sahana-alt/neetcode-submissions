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

//  public class Pair{
//     TreeNode node;
//     int d;
//     Pair(TreeNode t, int d){
//         this.node = t;
//         this.d = d;
//     }
//  }

class Solution {
    public int maxDepth(TreeNode root) {
        //recursion dfs
        // if(root==null){
        //     return 0;
        // }

        // return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
        


        //level order traversal using bfs
    //     if(root == null){
    //         return 0;
    //     }
    //     Queue<TreeNode> q = new LinkedList<>();
    //     int level =0;
    //     q.add(root);

    //     while(!q.isEmpty()){
    //         int size = q.size();    //imp:- u dont want  to process newly added children
            
    //         for(int i=0;i<size;i++){
    //             TreeNode node = q.poll();
    //             if(node.left!=null){
    //                 q.add(node.left);
    //             }
    //             if(node.right!=null){
    //                 q.add(node.right);
    //             }
               
    //         }
    //          level++;
    //     }


    // return level;

    //dfs iterative
    //use pair store node and distance
    //remove as pair
    //if node!=null push left and right with d+1
        // if(root==null){
        //     return 0;
        // }

        // Stack<Pair<TreeNode,Integer>> st = new Stack<>();
        
        // int maxd = 0;
       
        // st.push(new Pair<>(root,0));
        


        // while(!st.isEmpty()){
        //     //pair is like dictionary, do getkey and getvalue
        //     //nodes are explored with increasing depth
        //    Pair<TreeNode,Integer> p = st.pop();
        //    TreeNode node =p.getKey();
        //    int d = p.getValue();
            
        //     if(node!=null){
        //          maxd = Math.max(maxd,d);
        //          st.push(new Pair<>(node.left,d+1));
        //          st.push(new Pair<>(node.right,d+1));
        //     }
           
        // }
        
        //  return maxd+1;

        if(root == null) return 0;

        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
        
    }
}
