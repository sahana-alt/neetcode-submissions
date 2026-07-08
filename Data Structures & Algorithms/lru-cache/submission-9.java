class ListNode{
    int key;
    int val;

    ListNode prev,next;

    public ListNode(int key,int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }

}

// lru ---- mru

class LRUCache {

    int capacity = 0;
    ListNode left,right;
    Map<Integer,ListNode> mp;
    ListNode prev,next;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.mp = new HashMap<>();
        this.left = new ListNode(0,0);
        this.right = new ListNode(0,0);

        this.left.next = right;
        this.right.prev = left;

        
    }
    
    public int get(int key) {

        if(mp.containsKey(key)){
            ListNode node = mp.get(key);
            removeNode(node);
            addNode(node);
            return node.val;
        }

        return -1;
        
    }
    
    public void put(int key, int value) {

        if(mp.containsKey(key)){
            ListNode node = mp.get(key);
            removeNode(node);
            mp.remove(node.key);      
        }

        ListNode node = new ListNode(key,value);
        addNode(node);
        mp.put(key,node);

        if(mp.size()>capacity){
            ListNode lru = left.next;
            removeNode(lru);
            mp.remove(lru.key);
        }
    } 
    

    public void addNode(ListNode node){

        ListNode lastPrev = right.prev;
        lastPrev.next = node;

        node.prev = lastPrev;
        node.next = right;

        right.prev = node;

    }

    public void removeNode(ListNode node){
        ListNode leftNode = node.prev;
        ListNode rightNode = node.next;

        leftNode.next = rightNode;
        rightNode.prev = leftNode;

    }
}
