import Foundation

var s1: String = readLine()!

func swapCases(s1: inout String) {
    s1 = s1.map { char -> String in
        char.isLowercase ? char.uppercased() : char.lowercased()
    }.joined()
}

swapCases(s1: &s1)
print(s1)

