/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Map<Integer,Node> mp = new HashMap<>();
        int i=1;
        if(node==null){
            return null;
        }

        return dfs(node,mp);
        
    }

    public Node dfs(Node node,Map<Integer,Node> mp){
        if(node==null){
            return null;
        }

        if(mp.containsKey(node.val)) return mp.get(node.val);

        Node copyNode = new Node(node.val);
        mp.put(node.val, copyNode);

        //dfs to neighnor nodes of originial and add to copy node

        for(Node neighbor: node.neighbors){
            copyNode.neighbors.add(dfs(neighbor,mp));
        }

        return copyNode;
        
    }


}