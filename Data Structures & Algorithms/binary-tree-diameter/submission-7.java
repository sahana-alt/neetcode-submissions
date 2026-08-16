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
    int maxi =0;
    // qn why arratdeque for optimal method



    public int diameterOfBinaryTree(TreeNode root) {
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

if(root==null){
            return 0;
        }


dfs(root);
return maxi;
 }

 public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }

        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);
        int diam = lh+rh;  
            
        maxi = Math.max(diam,maxi);

        return Math.max(dfs(root.left), dfs(root.right));

        
    }

    public int maxHeight(TreeNode root){
            if(root==null){
            return 0;
        }

        return 1+ Math.max(maxHeight(root.left), maxHeight(root.right));

        }


    
// }
    //2nd way is recursive dfs whre i maintain a ghlobal variable
    // to eliminate the need of calculat=ing unnecessary subtree heights
    // i compute the dfs of root left and right
    //update the global wiuth max of global and sum of ythe dfs
    //return math.max(lh and rh)
    //tc - o(n) 
    // sc - o(h) - recf stack worst case o(n)
    //O(h) → O(log n) for balanced, O(n) for skewed
    // int diam = 0;
    // public int diameterOfBinaryTree(TreeNode root) {
    //     // int[] res = new int
    //     dfs(root);
    //     return diam;
    // }

    // private int dfs(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int left = dfs(root.left);
    //     int right = dfs(root.right);
    //     diam = Math.max(diam, left+right);

    //     return 1+Math.max(left,right);
    // }

    //by refereb=nce use an array ij java as tge recursive func shpuld remem
    //  int diam = 0;
    // public int diameterOfBinaryTree(TreeNode root) {
    //    int[] res = new int[1];
    //     dfs(root, res);
    //     return res[0];
    // }

    // private int dfs(TreeNode root, int[] res){
    //     if(root == null){
    //         return 0;
    //     }
    //     int left = dfs(root.left, res);
    //     int right = dfs(root.right, res);
    //     res[0] = Math.max(res[0], left+right);

    //     return 1+Math.max(left,right);
    // }

    //imp:- iterative solution is better to avoid stsck overflows
    // dfor extreemely skewed trees
    //height and diameter at every step
    // so a stack for visited status node, visited(bool)
    // and a map wioth node, maxh
    // so earlier we would push the parent without knowing childs scene
    // now we push node twicer , i mean first as noj visted,
    // secong as visted
    // if its !visted, u push it as visited and add 2 childern l asnd as non visited
    // else u do normal i.e u get maxh of l and r, diam = l+r and diam max
    // add it with map as node, 1+max (l,r)
    // we dont push diam as iots global and we are trying to do maxdept for that node only
    
    // Stack<new Object[]> st = new Stack<>();
    // HashMap<TreeNode, Integer> = new HashMap<>();
    // st.push(new Object[]{root,false});
    // int diam = 0;


    // while(!st.isEmpty()){

    //     TreeNode n = st.pop()[0];
    //     Bool visited = st.pop()[1];

    //     if(!visited){
    //         st.push(new Object[]{n, True});
    //         st.push(new Object[]{n.left, False});
    //         st.push(new Object[]{n.right, False});

    //     }else{
    //         int lh = maxHeight(node.left);
    //         int rh = maxHeight(node.right);
    //         diam = lh+rh;
    //         map.put(node, 1+Math.max(diam, ))

            


    //     }
    // }
       
    }
