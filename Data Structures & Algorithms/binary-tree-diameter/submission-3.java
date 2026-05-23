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
    // public int diameterOfBinaryTree(TreeNode root) {
        //brute force is by ca;culated the ;eft height ,ax and right height 
        // max and adding them, - max diam throughtg root
        // we use maxh fn on left and rifhght , add them
        // for maxd of the subtree we do math.max diam of root left and righ
        //trgen max of sub and root passing diam
        // recursio stack iimp- example below
        // tc = o(n2) best is o(nlogn) for balanced tree
        // because u keep recalculating hright of subtree 
        // sc - recursion stalk takes h for best case a nd n - 
        //no of nodes worst case
        /*
        diameterOfBinaryTree(1)
  ├── maxHeight(2)
  │     ├── maxHeight(4) → 1
  │     └── maxHeight(5) → 1
  │  → returns 2
  ├── maxHeight(3)
  │     ├── maxHeight(null) → 0
  │     └── maxHeight(null) → 0
  │  → returns 1
  ├── diameterOfBinaryTree(2)
  │     ├── maxHeight(4) → 1
  │     ├── maxHeight(5) → 1
  │     ├── diameterOfBinaryTree(4) → 0
  │     └── diameterOfBinaryTree(5) → 0
  │  → returns 2
  └── diameterOfBinaryTree(3)
        ├── maxHeight(null) → 0
        └── maxHeight(null) → 0
     → returns 0
→ final return = 3
*/
    //     if(root==null){
    //         return 0;
    //     }

    //     int lh = maxHeight(root.left);
    //     int rh = maxHeight(root.right);
    //     int diam = lh+rh;  
    //     int sub =  Math.max(diameterOfBinaryTree(root.left), 
    //     diameterOfBinaryTree(root.right));

    //     return Math.max(sub, diam);

        
    // }

    // public int maxHeight(TreeNode root){
    //         if(root==null){
    //         return 0;
    //     }

    //     return 1+ Math.max(maxHeight(root.left), maxHeight(root.right));

    //     }


    
// }
    //2nd way is recursive dfs whre i maintain a ghlobal variable
    // to eliminate the need of calculat=ing unnecessary subtree heights
    // i compute the dfs of root left and right
    //update the global wiuth max of global and sum of ythe dfs
    //return math.max(lh and rh)
    //tc - o(n) 
    // sc - o(h) - recf stack worst case o(n)
    //O(h) → O(log n) for balanced, O(n) for skewed
    int diam = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diam;
    }

    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        diam = Math.max(diam, left+right);

        return 1+Math.max(left,right);
    }
    
        
}
