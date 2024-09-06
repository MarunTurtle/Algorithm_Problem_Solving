public class Solution {
    public String solution (String code) {
        
        // Declare mode
        int mode = 0;
        
        // Declare result
        StringBuilder result = new StringBuilder();
        
        // Iterate through char in code
        for (int i = 0; i < code.length(); i++) {
             
            // If encountered 1; 
            if (code.charAt(i) == '1') {        
                // Switch the mode
                mode = 1 - mode;
                continue;
            }
            
            // If i % 2 == mode
            if (i % 2 == mode) {     
                // Add the character to the result
                result.append(code.charAt(i));
            }
                // Return result.toString()
        }
         
        return (result.toString().equals("")) ? "EMPTY" : result.toString();
    }
} 