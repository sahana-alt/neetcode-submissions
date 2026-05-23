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
        //use the idea of bfs but take rightmost
        //easiest use for leftview too
        //  List<List<Integer>> lout = new ArrayList<>();
        // if(root==null){
        //     return new ArrayList<>();
        // }

        // Queue<TreeNode> q = new ArrayDeque<>();
       
        // q.offer(root);

        // while(!q.isEmpty())
        // {
        //     int size = q.size();
            
        //     List<Integer> lin = new ArrayList<>();
            

        //     for(int i =0;i<size;i++){
        //         TreeNode node =  q.poll();
        //         lin.add(node.val);
        //         if(node.left!= null){
        //             q.offer(node.left);
                   
        //         } 
        //         if(node.right!= null){
        //             q.offer(node.right);
                 
        //         }
            
        //     }

        //     lout.add(lin);
        // }
        // List<Integer> l = new ArrayList<>();

        // for(int i=0;i<lout.size();i++)
        // {
        //     int linsize = lout.get(i).size();
        //     l.add((lout.get(i)).get(linsize-1));
        // }

        // return l;


        //little bettwer space opt

        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();

        if(root==null){
            return new ArrayList<>();
        }
        q.offer(root);


        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i =0;i<size;i++){
                TreeNode node =  q.poll();
                if(i == size-1){
                    res.add(node.val);
                }
                if(node.left!= null){
                    q.offer(node.left);
                   
                } 
                if(node.right!= null){
                    q.offer(node.right);
                 
                }
            
            }         
        }

        return res;


        
    }
}
