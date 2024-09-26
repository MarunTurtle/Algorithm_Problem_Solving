import java.util.*;

public class Solution {
    public String[] solution (String str) {
        
        int len = str.length();
        
        String[] result = new String[len];
        
        for (int i = 0; i < len; i++) {
            result[i] = str.substring(i);
        }
        
        Arrays.sort(result);
        
        return result;
    }
}