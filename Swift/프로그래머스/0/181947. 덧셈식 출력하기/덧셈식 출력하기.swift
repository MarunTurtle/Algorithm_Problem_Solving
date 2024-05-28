import Foundation

let inp = readLine()!.split(separator: " ").map { Int(String($0))! }
print("\(inp[0]) + \(inp[1]) = \(inp[0] + inp[1])")