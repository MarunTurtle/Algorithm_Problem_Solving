public class Solution {
    public String[] solution (String[] picture, int k) {
        
        StringBuilder sb = new StringBuilder();
        String[] result = new String[picture.length * k];
        int idx = 0;
        
        for (String row : picture) {
            for (int i = 0; i < row.length(); i++) {
                for (int j = 0; j < k; j++) {
                    sb.append(row.charAt(i));
                }                
            }
            for (int l = 0; l < k; l++) {
                result[idx++] = sb.toString();
            }
            sb.setLength(0);
        }
        
        return result;     
        
    }
}