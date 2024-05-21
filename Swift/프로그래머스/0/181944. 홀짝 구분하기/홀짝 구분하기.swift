import Foundation

let n = Int(readLine()!)!

switch n {
    case 0:
        print("\(n) is zero")
    case _ where n % 2 == 0:
        print("\(n) is even")
    case _  where n % 2 != 0:
        print("\(n) is odd")
    default:
        break
}
    