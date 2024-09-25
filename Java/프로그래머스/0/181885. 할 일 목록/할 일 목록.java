public class Solution {
    public String[] solution (String[] list, boolean[] fin) {
        
        int len = 0;
        for (int j = 0; j < fin.length; j++) {
            if (!fin[j]) {
                len++;
            }
        }
        
        String[] result = new String[len];
        
        for (int i = 0, j = 0; i < list.length; i++) {
            if (!fin[i]) {
                result[j++] = list[i];
            }
        }
        
        return result;
    }
}