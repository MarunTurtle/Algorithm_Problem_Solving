class Solution {
    public int solution(String myString, String pat) {
        
        // StringBuilder to build the modified string with swapped characters
        StringBuilder newString = new StringBuilder();
        
        // Iterate through each character in myString
        for (int i = 0; i < myString.length(); i++) {
            // Swap 'B' with 'A'
            if (myString.charAt(i) == 'B') {
                newString.append('A');
            }
            // Swap 'A' with 'B'
            else if (myString.charAt(i) == 'A') {
                newString.append('B');
            }
        } 
        
        // Check if the modified string contains the pattern pat
        if (newString.toString().contains(pat)) {
            return 1;  // Return 1 if pat is found
        } else {
            return 0;  // Return 0 if pat is not found
        }
    }
}
