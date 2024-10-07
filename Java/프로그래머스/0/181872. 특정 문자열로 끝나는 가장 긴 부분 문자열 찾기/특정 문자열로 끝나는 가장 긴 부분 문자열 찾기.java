public class Solution {
    public String solution (String myStr, String pat) {
        
        String answer = "";
        
        int len = myStr.length();
        
        for (int i = len; i >= 0; i--) {
            if (myStr.substring(0, i).endsWith(pat)) {
                return myStr.substring(0, i);
            }
        }
        
        return answer;
    }
}