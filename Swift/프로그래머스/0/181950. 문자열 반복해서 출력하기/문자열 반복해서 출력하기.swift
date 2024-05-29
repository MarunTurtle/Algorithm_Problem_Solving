import Foundation

let inp = readLine()!.split(separator: " ").map { String($0) }
let (a, b) = (inp[0], Int(inp[1])!)
print(String(repeating: a, count: b))