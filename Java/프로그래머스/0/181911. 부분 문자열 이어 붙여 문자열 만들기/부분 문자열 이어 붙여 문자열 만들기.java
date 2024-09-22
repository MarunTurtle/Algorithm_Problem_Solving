public class Solution {
    public String solution (String[] my_strings, int[][] parts) {
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < parts.length; i++) {
            int[] idxs = parts[i];   
            String str = my_strings[i];
            
            String substr = str.substring(idxs[0], idxs[1]+1);
            result.append(substr);
        }
        
        return result.toString();
    }
}