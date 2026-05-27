class MedianFinder {

    var arr: [Int] = []

    func addNum(_ num: Int) {

        arr.append(num)

        let sortedArray = arr.sorted{
            $0<$1
        }

        arr = sortedArray

    }

    func findMedian() -> Double {

        var res: Double = 0.0

        var n = arr.count

        if n % 2 == 1 {
            return Double(arr[n / 2])
        } else {
            let mid1 = arr[n / 2 - 1]
            let mid2 = arr[n / 2]
            return Double(mid1 + mid2) / 2.0

        }
   
        

    }
}
