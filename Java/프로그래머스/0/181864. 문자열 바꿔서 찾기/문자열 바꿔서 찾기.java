public class Solution {
    public int solution(String myStr, String pat) {
        
        int len = myStr.length();
        String[] result = myStr.split("");
        
        for (int i = 0; i < len; i++) {
            if (result[i].equals("A")) {
                result[i] = "B";
            } else {
                result[i] = "A";
            }
        }
        
        return String.join("", result).contains(pat) ? 1 : 0;
        
    }
}