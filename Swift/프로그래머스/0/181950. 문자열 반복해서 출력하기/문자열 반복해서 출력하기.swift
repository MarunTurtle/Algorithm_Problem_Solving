import Foundation

let inp = readLine()!.split(separator: " ")
let (str, n) = (String(inp[0]), Int(inp[1])!)
for _ in 0..<n {
    print(str, terminator: "")
}