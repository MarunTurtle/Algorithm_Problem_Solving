import Foundation

// Read a line from standard input
if let input = readLine() {
    // Convert each character: lowercase to uppercase, and uppercase to lowercase
    let transformed = input.map { character in
        // Check if the character is lowercase, convert to uppercase if true, otherwise convert to lowercase
        character.isLowercase ? character.uppercased() : character.lowercased()
    }.joined()
    
    // Print the transformed string
    print(transformed)
}