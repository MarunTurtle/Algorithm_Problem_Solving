public class Solution {
    public String solution (String myStr) {
        
        StringBuilder sb = new StringBuilder();
        int len = myStr.length();
        
        for (int i = 0; i < len; i++) {
            if (myStr.charAt(i) == 'a' || myStr.charAt(i) == 'A') {
                sb.append('A');
            } else {
                sb.append(("" + myStr.charAt(i)).toLowerCase());
            }
        }
        
        return sb.toString();        
        
    }
}