import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        
        // Declare ArrayList to store the result
        ArrayList<String> result = new ArrayList<>();
        
        // Declare length of the string
        int length = my_string.length();
        
        // Temporary StringBuilder to accumulate characters of a word
        StringBuilder word = new StringBuilder();
        
        // Iterate through the string character by character
        for (int i = 0; i < length; i++) {
            char currentChar = my_string.charAt(i);
            
            // If the current character is not a space, add it to the current word
            if (currentChar != ' ') {
                word.append(currentChar);
            } else {
                // If the current character is a space and we have a word, add it to the list
                if (word.length() > 0) {
                    result.add(word.toString());
                    word.setLength(0); // Clear the StringBuilder for the next word
                }
            }
        }
        
        // Add the last word to the list if there is one
        if (word.length() > 0) {
            result.add(word.toString());
        }
        
        // Convert ArrayList to String array and return
        return result.toArray(new String[0]);
    }
}
