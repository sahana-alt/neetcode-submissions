class ListNode{
    var key: Int
    var value: Int
    var prev: ListNode?
    var next: ListNode?

    init(_ key: Int, _ value: Int){
        self.key = key
        self.value = value
    }
}

class LRUCache {

    var head = ListNode(-1,-1)
    var tail = ListNode(-1,-1)
    var size = 0
    var mp: [Int: ListNode] = [:]

    init(_ capacity: Int) {
        self.size = capacity
        head.next = tail
        tail.prev = head

    }

    func get(_ key: Int) -> Int {

        guard let node = mp[key] else{
            return -1
        }

        remove(node)
        addToLast(node)

        return node.value

    }

    func put(_ key: Int, _ value: Int) {

        //alreeady there

        if let node = mp[key]{
//imp
            node.value = value
            remove(node)
            addToLast(node)
            return

        }

        let node = ListNode(key,value)
        mp[key] = node

        addToLast(node)

        if mp.count > size {
            if let lru = head.next{
                remove(lru)
                mp[lru.key] = nil

            }

            

            
        }


    }

    func remove(_ node: ListNode){

        let prevNode = node.prev
        let nextNode = node.next

        prevNode?.next = nextNode
        nextNode?.prev = prevNode

        node.next = nil
        node.prev = nil


    }

     func addToLast(_ node: ListNode){
        var lastPrevNode = tail.prev

        lastPrevNode?.next = node
        node.prev = lastPrevNode



        node.next = tail
        tail.prev = node
        tail.next = nil
     }
}
