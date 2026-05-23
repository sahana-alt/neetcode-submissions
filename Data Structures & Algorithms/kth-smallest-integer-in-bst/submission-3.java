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

    //imp:- inorder gives sorted order

    // int c=0;
    // int ans=0;
    // public int kthSmallest(TreeNode root, int k) {

     
    //     inorder(root,k);
    //     return ans;
    
    // }

    // private void inorder(TreeNode node, int k){
    //     if(node==null){
    //         return;
    //     }

    //     inorder(node.left,k);
    //     c++;

    //     if(c==k){
    //        ans=node.val;
    //        return; 
    //     }
    //     inorder(node.right,k);
    // }


    //imp:- pass by reference

   

//     public int kthSmallest(TreeNode root, int k) {

        

     
      
//         return inorder(root,new int []{k}); //imp:- new int
    
//     }

//     private int inorder(TreeNode node, int[] k){
//         if(node==null){
//             return -1;
//         }

//         int left = inorder(node.left,k);

//         if(left!=-1){return left;}
//         k[0]--;
//         if(k[0]==0){
//             return node.val;
//         }

        
//         int right = inorder(node.right, k);
// if (right != -1) return right;
// return -1;
        
//     }

//preorder witgh list and sorting appropach
//pass the list,to preorder fn,add, left, right
 //do collectiobs .sort and return k-1

 //iterative dfs
    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> st = new Stack<>();
        TreeNode cur = root;
        //in inorder u dont push root before
        //go leftmost add to stack pop and go to its right

        while(!st.isEmpty()||cur!=null){    //or
            //left
            while(cur!=null){
                st.push(cur);
                cur=cur.left;
            }
            cur = st.pop();
            k--;
            if(k==0){
                return cur.val;
            }
            cur = cur.right;

        }
        return -1;
    }



}
