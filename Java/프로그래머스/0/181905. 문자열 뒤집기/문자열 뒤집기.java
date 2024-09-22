public class Solution {
    public String solution (String my_string, int s, int e) {
        
        StringBuilder result = new StringBuilder(my_string);
        
        String reversed = new StringBuilder(my_string.substring(s, e+1)).reverse().toString();
        
        result.replace(s, e+1, reversed);
        
        return result.toString();
        
        
    }
}