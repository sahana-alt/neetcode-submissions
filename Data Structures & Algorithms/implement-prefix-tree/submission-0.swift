class TrieNode{
    var children = Array<TrieNode?>(repeating: nil, count: 26)
    var isEnd : Bool = false
}


class PrefixTree {

    var root = TrieNode()

    func insert(_ word: String) {

        var node = root

        for ch in word {

            let index = Int(ch.asciiValue! - 97)

            if node.children[index] == nil {
                node.children[index] = TrieNode()
            }

            node = node.children[index]!
        }

        node.isEnd = true

    }

    func search(_ word: String) -> Bool {


        var node = root

        for ch in word {

            let index = Int(ch.asciiValue! - 97)

            if node.children[index] == nil {
                return false
            }

            node = node.children[index]!
        }

        return node.isEnd

    }

    func startsWith(_ prefix: String) -> Bool {
        var node = root

        for ch in prefix {

            let index = Int(ch.asciiValue! - 97)

            if node.children[index] == nil {
                return false
            }

            node = node.children[index]!
        }

        return true

    }
}
