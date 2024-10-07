public class Solution {
    public int solution(String myStr, String pat) {
        
        int len = myStr.length();
        int count = 0;
        
        for (int i = len; i >= 0; i--) {
            if (myStr.substring(0, i).endsWith(pat)) {
                count++;
            }
        }
        
        return count;
    }
}