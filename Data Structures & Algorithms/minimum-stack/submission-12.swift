class MinStack {

    var st1: [Int] = []
    var st2: [Int] = [] //tracks only minimum

    init() {

      

    }

    func push(_ val: Int) {

        st1.append(val)
        
        if st2.isEmpty || val <= st2.last!{
            st2.append(val)
        }


    }

    func pop() {

        let element = st1.removeLast()

        if element == st2.last!{
            st2.removeLast()
        }
  

    }

    func top() -> Int {

        st1.last!

    }

    func getMin() -> Int {

        return st2.last!

    }
}
