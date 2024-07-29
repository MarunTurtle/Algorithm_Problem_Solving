public class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        
        sb.replace(s, s+overwrite_string.length(), overwrite_string);
        
        return sb.toString();
    }
}
