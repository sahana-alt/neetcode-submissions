class LRUCache {
    //arraylist has 0(n) and o(1)
    // private ArrayList<int[]> cache;
    // private int size; 
    // public LRUCache(int capacity) {
        
    //     this.cache = new ArrayList<>();
    //     this.size = capacity;
    // }
    
    // public int get(int key) {
    //     for(int i=0;i<cache.size();i++){
    //         if(cache.get(i)[0]==key){ // imp:-get
    //             int[] temp = cache.remove(i); //remove
    //             cache.add(temp);
    //             return temp[1];
    //         }
            
    //     }
    //    return -1; 
    // }
    
    // public void put(int key, int value) {
    //     for(int i=0;i<cache.size();i++){
    //         if(cache.get(i)[0]==key){ // imp:-get
    //             int[] temp = cache.remove(i); //remove
    //             temp[1] = value;
    //             cache.add(temp);
    //             return;
    //         }
    //     }

    //         if(size == cache.size()){
    //             cache.remove(0);
    //         }

    //         cache.add(new int[]{key,value});  //add
            
    //     }

    //optimal aaproach tc and sc of o(1)
    //dl
    //have left right next and prev
    //2 fns insert and delete
    //in inst u consider left and right nodes and insert node 
    //ijn between
    //while removing u remove and link left and right
    //in get u check if hmap contains key 
    //then u do get(key) returns node
    //remove and add and return val maintain lru
    //if not return -1
    //while putting if it contains key
    //u do map. remove of thst key
    // u create node of key val
    //add to map and dll
    //chec k if map size >cap
    //u get left's prev which is lru
    //u remove that from map and dll
    //dont ttraverse as its not needed

    public class Node{
        int key,val;
        Node prev,next;
        public Node(int key,int val){
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
            
        }
    }

    private int size;
    private Map<Integer, Node> cache;
    private Node left;
    private Node right;
    int capacity=0;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = right;
        this.right.prev = left;

   
    }
    
    public int get(int key) {

        // for(int i=0;i<cache.size();i++){ // not needed
        if(cache.containsKey(key)){
                Node node = cache.get(key);
                removeNode(node);
                addNode(node);
                return node.val;
            }
        
        return -1;
    }
    
    private void removeNode(Node node){
        Node l = node.prev;
        Node r = node.next;

        l.next = r;
        r.prev = l;

    }
    private void addNode(Node node){
        //right's prev is most recent
        Node prevNode = right.prev;
        prevNode.next = node; //imp
       

        node.next = right;
        node.prev = prevNode;

        right.prev = node;  // imp as it will be tail

    }

    public void put(int key, int value) {

       
        if(cache.containsKey(key)){
             Node oldNode = cache.get(key);
            removeNode(oldNode);
            cache.remove(key);         
        }
       

        Node newNode = new Node(key, value) ;
        addNode(newNode);
        cache.put(key, newNode);

        if(cache.size()>capacity){
            //imp left next is lease recent
            Node lru = left.next;
            cache.remove(lru.key);      //imp
            removeNode(lru);
        }
    } 


        
    }

