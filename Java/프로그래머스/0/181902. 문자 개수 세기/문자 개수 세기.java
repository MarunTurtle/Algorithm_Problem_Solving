import java.util.*;

public class Solution {
    public int[] solution(String my_string) {
        
        int[] result = new int[52];
        
        for (char c : my_string.toCharArray()) {
            
            int idx = 0;
            
            if (Character.isUpperCase(c)) {
                idx = 0 + c - 'A';    
            } else {
                idx = 0 + c - 'a' + 26;
            }
            
            result[idx]++;
        }      
        
        return result;
    }
    
    
}