import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String myString) {
        
        // Declare ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();
        
        // Initialize count
        int count = 0;
        
        // Iterate through the string
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            
            if (currentChar == 'x') {
                // Add the current count to the result list
                result.add(count);
                // Reset count for the next segment
                count = 0;
            } else {
                // Increment count for non-'x' characters
                count++;
            }
        }
        
        // Add the final count after the last segment
        result.add(count);
        
        return result;
    }
}
