public class Solution {
    public int solution (int[] numarr) {
        
        int result = -1;
        int j = 0;
        
        for (int num : numarr) {
            if (num < 0) {
                result = j;
                break;
            }
            j++;
        }
        
        return result;
        
    }
} 