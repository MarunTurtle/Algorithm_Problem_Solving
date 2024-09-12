public class Solution {
    public String solution (String[] my_strings, int[][] parts) {
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < parts.length; i++) {
            String substr = my_strings[i].substring(parts[i][0], parts[i][1]+1);
            result.append(substr);
        }
        
        return result.toString();
    }
}