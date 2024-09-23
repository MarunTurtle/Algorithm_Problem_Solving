import java.util.*;

public class Solution {
    public String solution (String my_string, int m, int c) {
        
        StringBuilder result = new StringBuilder();
        
        for (int i = c - 1; i < my_string.length(); i += m) {
            result.append(my_string.charAt(i));
        }
        
        return result.toString();
    }
}