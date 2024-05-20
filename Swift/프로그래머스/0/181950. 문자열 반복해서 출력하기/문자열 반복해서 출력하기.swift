import Foundation

let input = readLine()!.split(separator: " ").map { $0 }
let (s1, a) = (input[0], Int(input[1])!)

for i in 0..<a {
    print(s1, terminator: "")
}