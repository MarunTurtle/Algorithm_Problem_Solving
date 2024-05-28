import Foundation

let inp = readLine()!

for char in inp {
    var result = char == char.uppercased ? char.lowercased : char.uppercased
    print(result, terminator: "")
}