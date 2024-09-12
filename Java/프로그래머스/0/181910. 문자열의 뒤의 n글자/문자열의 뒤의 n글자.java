class Solution {
    public String solution (String my_string, int n) {
        
        StringBuilder result = new StringBuilder(my_string);
        
        int len = my_string.length();
        
        return result.substring(len-n).toString();      
        
    }
}