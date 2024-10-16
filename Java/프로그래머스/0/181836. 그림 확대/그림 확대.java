public class Solution {
    public String[] solution (String[] picture, int size) {
        
        int len = picture.length;
        int rowlen = picture[0].length();
        String[] result = new String[len * size];
        int idx = 0;
        
        // For every row(String) in a picture
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            String[] temp = picture[i].split("");
            // Add the pixels * k
            for (int j = 0; j < rowlen; j++) {
                for (int k = 0; k < size; k++) {
                    sb.append(temp[j]);
                }
            }
            for (int l = 0; l < size; l++) {
                result[idx++] = sb.toString();     
            }
          
        }
        // return result
        return result;
    }
}