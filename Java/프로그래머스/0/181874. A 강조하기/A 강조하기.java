class Solution {
    public String solution(String myString) {
        // Use StringBuilder to build the result string
        StringBuilder result = new StringBuilder();
        
        // Iterate through each character of the string
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            
            // If the character is 'a', convert to 'A'
            if (currentChar == 'a') {
                result.append('A');
            } 
            // If the character is an uppercase letter but not 'A', convert to lowercase
            else if (Character.isUpperCase(currentChar) && currentChar != 'A') {
                result.append(Character.toLowerCase(currentChar));
            } 
            // Otherwise, just append the character as is
            else {
                result.append(currentChar);
            }
        }
        
        // Convert StringBuilder to String and return it
        return result.toString();
    }
}
