import Foundation

let inp = readLine()!.split(separator: " ")
let (str, n) = (String(inp[0]), Int(inp[1])!)
print(String(repeating: str, count: n))