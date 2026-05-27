class TrieNode{
    var children: [Character: TrieNode] = [:]
    var isEnd: Bool = false
}


class WordDictionary {

    var root = TrieNode()

    func addWord(_ word: String) {

        var node = root

        let chars = Array(word)

        for ch in chars {

            

            if node.children[ch] == nil {
             
                node.children[ch] = TrieNode()
            }
         
            node = node.children[ch]!
            

           
        }

        node.isEnd = true 

    }

    func search(_ word: String) -> Bool {

        let chars = Array(word)
        var start = root

        func dfs(_ index: Int, _ node: TrieNode)-> Bool{

            var node = node

            if index == chars.count {
                return node.isEnd   
            }

            var ch = chars[index]

          

                if ch == "." {

                    for child in node.children.values {

                        if dfs(index+1, child) {
                            return true
                        }
                    }

                    return false
                } else{

                    guard let next = node.children[ch] else {
                        return false
                    }

                    node = next


                }
           

            return dfs(index+1, node)

        }

        return dfs(0, start)

    }
}
