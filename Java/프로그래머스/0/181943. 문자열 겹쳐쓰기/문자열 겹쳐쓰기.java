class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        StringBuilder nStr = new StringBuilder(my_string);
        
        nStr.replace(s, s+overwrite_string.length(), overwrite_string);
        
        return nStr.toString();
        
    }
}