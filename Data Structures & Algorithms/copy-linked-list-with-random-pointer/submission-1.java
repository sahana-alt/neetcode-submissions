/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head == null){
            return null;
        }

        Node newHead = new Node(head.val);
        Node oldTemp =head.next, newTemp;
        newTemp = newHead;
        //map to store corp addresses
        Map<Node, Node> m = new HashMap<>();
        m.put(head, newHead);

        while(oldTemp!=null){
            Node node = new Node(oldTemp.val);
            newTemp.next = node;
            m.put(oldTemp,node); //important not, newTemp
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;


        }
        oldTemp = head;
        newTemp = newHead;

        while(oldTemp!=null){
            //address
           
            newTemp.random = m.getOrDefault(oldTemp.random,null);
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;

        }
        return newHead;
    }
}
