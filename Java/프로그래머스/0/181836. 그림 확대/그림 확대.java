class Solution {
    public String[] solution(String[] picture, int k) {
        int len = picture.length;
        int width = picture[0].length();
        String[] nPicture = new String[len * k];
        
        // Iterate over each row in the original picture
        for (int i = 0; i < len; i++) {
            StringBuilder newRow = new StringBuilder();
            
            // Expand each character in the row horizontally by k
            for (int j = 0; j < width; j++) {
                char c = picture[i].charAt(j);
                for (int l = 0; l < k; l++) {
                    newRow.append(c);
                }
            }
            
            // Repeat the newRow k times to expand it vertically
            for (int m = 0; m < k; m++) {
                nPicture[i * k + m] = newRow.toString();
            }
        }
        
        return nPicture;
    }
}
