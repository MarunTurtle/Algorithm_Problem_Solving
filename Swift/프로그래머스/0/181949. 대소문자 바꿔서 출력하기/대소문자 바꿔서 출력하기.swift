import Foundation

if let input = readLine() {
    let transformed = input.map { character in
        character.isLowercase ? character.uppercased() : character.lowercased()
    }.joined()
    
    print(transformed)
}