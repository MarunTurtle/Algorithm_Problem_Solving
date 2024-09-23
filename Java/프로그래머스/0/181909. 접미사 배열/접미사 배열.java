import java.util.*;

public class Solution {
    public String[] solution (String my_string) {
        
        int len = my_string.length();
        
        String[] result = new String[len];
        
        for (int i = 0; i < len; i++) {
            result[i] = my_string.substring(i);
        }
            
        Arrays.sort(result);
        
        return result;
    
    }
}