class Solution {
    public String solution (String my_string, int s, int e) {
        
        StringBuilder substr = new StringBuilder(my_string.substring(s, e+1));
        
        String reversed = substr.reverse().toString();
        
        StringBuilder result = new StringBuilder(my_string.substring(0, s) + reversed + my_string.substring(e+1));
        
        return result.toString();
        
    }
}