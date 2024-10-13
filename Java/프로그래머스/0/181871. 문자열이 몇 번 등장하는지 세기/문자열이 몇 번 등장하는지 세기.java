public class Solution {
    public int solution (String myStr, String pat) {
        
        int count = 0;
        int len = myStr.length();
        int sublen = pat.length();
        
        for (int i = len; i >= sublen; i--) {
            if (myStr.substring(0, i).endsWith(pat)) {
                count++;
            }
        }
        
        return count;
    }
}