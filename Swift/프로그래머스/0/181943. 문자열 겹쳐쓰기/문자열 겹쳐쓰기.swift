import Foundation

func solution(_ my_string:String, _ overwrite_string:String, _ s:Int) -> String {
    let prefix = my_string.prefix(s)
    let suffix = my_string.dropFirst(s + overwrite_string.count)
    return prefix + overwrite_string + suffix
}