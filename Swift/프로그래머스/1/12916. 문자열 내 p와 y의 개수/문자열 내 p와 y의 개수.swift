import Foundation

func solution(_ s: String) -> Bool {
    let lowercasedString = s.lowercased()
    let pCount = lowercasedString.filter { $0 == "p" }.count
    let yCount = lowercasedString.filter { $0 == "y" }.count
    return pCount == yCount
}