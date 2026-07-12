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

    int c=0;
    int ans=0;
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

        // Stack<TreeNode> st = new Stack<>();
        // TreeNode cur = root;
        //in inorder u dont push root before
        //go leftmost add to stack pop and go to its right

    //     while(!st.isEmpty()||cur!=null){    //or
    //         //left
    //         while(cur!=null){
    //             st.push(cur);
    //             cur=cur.left;
    //         }
    //         cur = st.pop();
    //         k--;
    //         if(k==0){
    //             return cur.val;
    //         }
    //         cur = cur.right;

    //     }
    //     return -1;
    // }

    //morris
    //sc is best as its o(1) nio stack or recursion
    //using threaded bt, do 2-3 dry run aftrr striver video

    // List<Integer> l = new ArrayList<>();

    // TreeNode cur = root;

    // while(cur!=null){
    //     if(cur.left==null){
    //         //leftmost so move right
    //         l.add(cur.val);
    //         cur = cur.right;

    //     }else{
    //         TreeNode pred = cur.left;
    //         //go to rightmost
    //         while(pred.right!=null&& pred.right!=cur){
    //             pred = pred.right;

    //         }

    //         //create a thread
    //         //else //remove thrad{
    //         if(pred.right == null){               
    //             pred.right = cur;
    //             cur = cur.left;
    //         }else{

    //             pred.right=null;
    //             l.add(cur.val);
    //             //dubt
    //             cur = cur.right;

    //         }      

    //     }
    // }
    // return l.get(k-1);

    List<Integer> l = new ArrayList<>();

    TreeNode cur = root;

    while(cur!=null){
        if(cur.left == null){
            l.add(cur.val);
            cur=cur.right;
        }else{
            TreeNode prev = cur.left;
            while(prev.right!=null && prev.right!=cur){
                prev = prev.right;
            }

            if(prev.right == null){
                prev.right = cur;
                cur = cur.left;
            }else{
                prev.right = null;
                l.add(cur.val);
                cur = cur.right;
            }
        }
    }

    return l.get(k-1);



    }

    

}
