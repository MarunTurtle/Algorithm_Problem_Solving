public class Solution {
    public String solution(String myStr) {
        
        String[] result = myStr.split("");
        int len = myStr.length();
        
        for (int i = 0; i < len; i++) {
            if (result[i].equals("m")) {
                result[i] = "rn";
            }
        }
        
        return String.join("", result);
    }
}