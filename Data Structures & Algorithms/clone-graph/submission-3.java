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
        Map<Node,Node> mp = new HashMap<>();
        int i=1;
        if(node==null){
            return null;
        }

        return dfs(node,mp);
        // return bfs(node,mp);
        
    }

    // public Node bfs(Node node, Map<Node,Node> mp){
    //     if(node == null){
    //         return null;
    //     }
    //     Queue<Node> q = new ArrayDeque<>();
    //     Node copy = new Node(node.val);
    //     mp.put(node,copy);
    //     q.add(node);

    //     while(!q.isEmpty()){
    //         Node orig = q.poll();

    //         for (Node neighbor : orig.neighbors) {
    //         if (!mp.containsKey(neighbor)) {
    //             mp.put(neighbor, new Node(neighbor.val));
    //             q.add(neighbor);
    //         }
    //         mp.get(orig).neighbors.add(mp.get(neighbor));
    //         }
                     
    //     }

    //     return mp.get(node);
    // }

     public Node dfs(Node node, Map<Node,Node> mp){
        if(node == null){
            return null;
        }
        Stack<Node> st = new Stack<>();
        Node copy = new Node(node.val);
        mp.put(node,copy);
        st.push(node);

        while(!st.isEmpty()){
            Node orig = st.pop();

            for (Node neighbor : orig.neighbors) {
            if (!mp.containsKey(neighbor)) {
                mp.put(neighbor, new Node(neighbor.val));
                st.push(neighbor);
            }
            mp.get(orig).neighbors.add(mp.get(neighbor));
            }
                     
        }

        return mp.get(node);
    }

    // public Node dfs(Node node,Map<Integer,Node> mp){
    //     if(node==null){
    //         return null;
    //     }

    //     if(mp.containsKey(node.val)) return mp.get(node.val);

    //     Node copyNode = new Node(node.val);
    //     mp.put(node.val, copyNode);

    //     //dfs to neighnor nodes of originial and add to copy node

    //     for(Node neighbor: node.neighbors){
    //         copyNode.neighbors.add(dfs(neighbor,mp));
    //     }

    //     return copyNode;
        
    // }


}