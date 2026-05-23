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

public class Codec {

    //Encodes a tree to a single string.

    //dfs
    // public String serialize(TreeNode root) {

    //     List<String> l = new ArrayList<>();
    //     dfsSerialise(root,l);

    //     return String.join(" ",l);
        
    // }

    // public void dfsSerialise(TreeNode node, List<String> l){
    //     if(node == null){
    //         l.add("n");
    //         return;
    //     }

    //     l.add(String.valueOf(node.val));
    //     dfsSerialise(node.left, l);
    //     dfsSerialise(node.right,l);

    // }

    // // Decodes your encoded data to tree.
    // public TreeNode deserialize(String data) {
    //     String[] vals = data.split(" ");
       
    //     int[] i = {0};  //mutable index

    //     return dfsDesrialise(vals,i);


        
    // }

    // public TreeNode dfsDesrialise(String[] vals,int [] i){
    //     if(vals[i[0]].equals("n")){ //imp: to use .equals obj ref
    //         i[0]++;
    //         return null;

    //     }

    //     //imp:- i[o]++
    //     TreeNode node = new TreeNode(Integer.parseInt(vals[i[0]++]));
    //     node.left = dfsDesrialise(vals,i);
    //     node.right = dfsDesrialise(vals,i);

    //     return node;



    // }


    //bfs
    public String serialize(TreeNode root) {

        //imp:- arrayDeque does not aklow null elements
        //use LL

        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        if(root==null){
            return "";
        }
        q.add(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node == null){
                sb.append("n ");
                continue;
            }

            sb.append(String.valueOf(node.val)+" ");
            q.add(node.left);
            q.add(node.right);
        }

        return sb.toString();
        
    }

   

    // Decodes your encoded data to tree.
    //imp:- use LL
    //second if
    public TreeNode deserialize(String data) {
        if(data == ""){
            return null;
        }
        String[] vals = data.split(" ");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        q.add(root);
        for(int i=1;i< vals.length;i++){
            TreeNode parentNode = q.poll();

            if(!vals[i].equals("n")){
                TreeNode leftNode = new TreeNode(Integer.parseInt(vals[i]));
                parentNode.left = leftNode;
                q.add(leftNode);
            }
            if(!vals[++i].equals("n")){
                //imp:- stores the incremented i
                TreeNode rightNode = new TreeNode(Integer.parseInt(vals[i]));
                parentNode.right = rightNode;
                q.add(rightNode);
            }
        }

        return root;
        
    }
}
