public class Solution {
    public String solution (String str1, String str2) {
        
        StringBuilder result = new StringBuilder();
        
        int len = str1.length();
        for (int i = 0; i < len; i++) {
            result.append(str1.charAt(i));     
            result.append(str2.charAt(i));
        }
        
        return result.toString();
        
    }
}