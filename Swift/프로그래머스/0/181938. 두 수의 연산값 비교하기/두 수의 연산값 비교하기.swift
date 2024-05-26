import Foundation

func solution(_ a: Int, _ b: Int) -> Int {
    let concatenatedValue = Int(String(a) + String(b))!
    let productValue = 2 * a * b
    
    if concatenatedValue >= productValue {
        return concatenatedValue
    } else {
        return productValue
    }
}