import Foundation

let inp = String(readLine()!)

for char in inp {
    print(char.isLowercase ? char.uppercased() : char.isUppercase ? char.lowercased() : String(char), terminator: "")
}