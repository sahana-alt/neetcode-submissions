class LRUCache {
    public class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

        Node head = new Node(-1,-1);
        Node tail = new Node(-1,-1);
        int cap ;
        Map<Integer,Node> m = new HashMap<>();
       
    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
        
    }

    public void addNode(Node n){
      Node temp = head.next;

      n.prev = head;
      head.next = n;
      n.next = temp;
      temp.prev = n;
        
    }

    public void deleteNode(Node n){
        if (n == null || n.prev == null || n.next == null) {
        return; // Avoid NullPointerException
    }

        Node older = n.prev;
        Node newer = n.next;
    

        newer.prev = older;
        older.next = newer;

    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            
            Node n = m.get(key);
            m.remove(key);
            deleteNode(n);
            addNode(n);
             m.put(key,head.next);
            return n.val;
        }
    return -1;
        
    }
     
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            Node n = m.get(key);
            deleteNode(n);
            m.remove(key);
          
           
        }
        if(m.size() == cap){
            Node n = tail.prev;
            m.remove(n.key);
            deleteNode(tail.prev);
           
        }
        addNode(new Node(key,value));
        m.put(key,head.next);
        
        
    }

    
}
