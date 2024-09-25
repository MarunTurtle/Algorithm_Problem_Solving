public class Solution {
    public String[] solution (String[] names) {
        
        String[] result = new String[(names.length - 1 + 5)/5];
        for (int i = 0, j = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                result[j++] = names[i];  
            }
        }
        return result;
    }
}