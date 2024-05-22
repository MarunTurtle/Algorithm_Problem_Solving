func solution(_ str1: String, _ str2: String) -> String {
    var result = ""
    
    let length1 = str1.count
    let length2 = str2.count
    let maxLength = max(length1, length2)
    
    for i in 0..<maxLength {
        if i < length1 {
            let index = str1.index(str1.startIndex, offsetBy: i)
            result.append(str1[index])
        }
        if i < length2 {
            let index = str2.index(str2.startIndex, offsetBy: i)
            result.append(str2[index])
        }
    }
    
    return result
}