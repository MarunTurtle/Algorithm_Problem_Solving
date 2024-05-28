import Foundation

print(readLine()!.map { $0.isLowercase ? $0.uppercased() : $0.lowercased() }.joined())