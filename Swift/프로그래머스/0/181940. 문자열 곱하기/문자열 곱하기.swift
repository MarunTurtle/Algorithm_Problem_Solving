import Foundation

func solution(_ myString:String, _ k:Int) -> String {
    var newString = ""
    for i in 0..<k {
        newString.append(myString)
    }
        
    return newString
}