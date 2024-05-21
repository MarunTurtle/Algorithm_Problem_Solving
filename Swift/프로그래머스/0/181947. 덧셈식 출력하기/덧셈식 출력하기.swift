import Foundation

let n = readLine()!.split(separator: " ").map { Int($0)! }
let (a, b) = (n[0], n[1])

print("\(a) + \(b) = \(a+b)")