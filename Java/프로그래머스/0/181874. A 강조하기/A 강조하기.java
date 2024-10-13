public class Solution {
    public String solution(String myStr) {
        int len = myStr.length();
        
        String[] result = myStr.split("");
        
        for (int i = 0; i < len; i++) {
            if (result[i].toUpperCase().equals("A")) {
                result[i] = result[i].toUpperCase();
            } else {
                result[i] = result[i].toLowerCase();
            }
        }
        
        return String.join("", result);
    }
}