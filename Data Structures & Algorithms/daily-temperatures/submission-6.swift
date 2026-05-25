class Solution {
    func dailyTemperatures(_ temperatures: [Int]) -> [Int] {

        var res:[Int] = Array(repeating:0,count: temperatures.count)

        var st:[[Int]] = []

        for i in stride(from: temperatures.count - 1, through:0, by: -1) {


            while !st.isEmpty && st.last![0] <= temperatures[i]{
                st.removeLast()
            }

            if !st.isEmpty {
                res[i] = st.last![1] - i
            }

            st.append([temperatures[i],i])

        }

        return res

    }
}
