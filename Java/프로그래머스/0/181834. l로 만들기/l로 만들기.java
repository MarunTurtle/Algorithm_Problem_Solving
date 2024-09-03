class Solution {
    public String solution(String myString) {
        char[] result = new char[myString.length()]; // Create a char array for the result
        
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            if (currentChar < 'l') {
                result[i] = 'l'; // Directly assign 'l' if the character is before 'l'
            } else {
                result[i] = currentChar; // Otherwise, assign the original character
            }
        }
        
        return new String(result); // Convert the char array to a String
    }
}



// class Solution {
//     public String solution(String myString) {
        
//         StringBuilder nString = new StringBuilder();
        
//         for (int i = 0; i < myString.length(); i++) {
//             if (myString.charAt(i) < 'l') {
//                 nString.append("l");
//             } else {
//                 nString.append(myString.charAt(i));
//             }
//         }
//         return nString.toString();
//     }
// }