import Foundation

func solution(_ num:Int, _ n:Int) -> Int {
    let result = num % n == 0 ? 1 : 0
    return result
}