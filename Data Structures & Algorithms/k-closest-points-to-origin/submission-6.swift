class Solution {
    func kClosest(_ points: [[Int]], _ k: Int) -> [[Int]] {

        let sortedPoints = points.sorted { p1,p2 in

            let d1 = p1[0] * p1[0] + p1[1] * p1[1]
            let d2 = p2[0] * p2[0] + p2[1] * p2[1]

            return d1 < d2

        }

        return Array(sortedPoints.prefix(k))


    }
}
