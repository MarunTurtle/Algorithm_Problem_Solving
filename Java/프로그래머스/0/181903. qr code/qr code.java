public class Solution {
    public String solution (int q, int r, String code) {
        
        StringBuilder result = new StringBuilder();
        
        for (int i = r; i < code.length(); i += q) {
            result.append(code.charAt(i));
        }
        
        return result.toString();
    }
}