import Foundation

func solution(_ my_string: String, _ overwrite_string: String, _ s: Int) -> String {
    return String(my_string.prefix(s)) + overwrite_string + my_string.dropFirst(s + overwrite_string.count)
}