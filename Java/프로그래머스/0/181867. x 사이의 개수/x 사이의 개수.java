import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String myString) {
        
        // Declare length
        int length = myString.length();
        
        // Declare ArrayList
        ArrayList <Integer> result = new ArrayList<>();
        
        // Declare count
        int count = 0;
        
        // Iterate through myString
        for (int i = 0; i < length; i++) {
            
            if (myString.charAt(i) == 'x') {
                // add the count
                result.add(count);
                // restart the count
                count = 0;
            } else {
                count++;
            }
        }
        
        result.add(count);
         
        
        return result;
        
    }
}