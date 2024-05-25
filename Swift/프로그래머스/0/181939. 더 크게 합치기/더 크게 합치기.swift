import Foundation

func solution(_ a: Int, _ b: Int) -> Int {
    let aStr = String(a)
    let bStr = String(b)
    let ab = Int(aStr + bStr)!
    let ba = Int(bStr + aStr)!
    
    return max(ab, ba)
}