public class Solution {
    public String solution (String str1, String str2) {
        
        StringBuilder sb = new StringBuilder();
        
        int len = str1.length();
        
        for (int i = 0; i < len; i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        
        return sb.toString();
    }
}