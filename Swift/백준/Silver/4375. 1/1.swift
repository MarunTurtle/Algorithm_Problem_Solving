import Foundation

func findSmallestAllOnesMultipleLength(_ n: Int) -> Int {
    var num = 1
    var length = 1
    
    while num % n != 0 {
        num = (num * 10 + 1) % n
        length += 1
    }
    
    return length
}

while let line = readLine(), let n = Int(line) {
    print(findSmallestAllOnesMultipleLength(n))
}