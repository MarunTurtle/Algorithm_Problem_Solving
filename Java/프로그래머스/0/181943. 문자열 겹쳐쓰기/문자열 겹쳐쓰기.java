import java.util.*;

public class Solution { 
    public String solution (String my_string, String overwrite_string, int s) {
        
        StringBuilder result = new StringBuilder(my_string);
        
        result.replace(s, s + overwrite_string.length(), overwrite_string);
        
        return result.toString();
    }    
}