class Solution {
    public String solution(String my_string, String alp) {
        
        // StringBuilder for fluent update
        StringBuilder result = new StringBuilder();
        
        // Declare Length
        int length = my_string.length();
        
        // Convert the single-character string 'alp' to a char
        char targetChar = alp.charAt(0);
        
        // Iterate through my_string
        for (int i = 0; i < length; i++) {
            char curChar = my_string.charAt(i);
            
            // Check if the current character matches the target character
            if (curChar == targetChar) {
                result.append(Character.toUpperCase(curChar));               
            } else {
                result.append(curChar);
            }
        }     
        
        return result.toString();
    }
}
