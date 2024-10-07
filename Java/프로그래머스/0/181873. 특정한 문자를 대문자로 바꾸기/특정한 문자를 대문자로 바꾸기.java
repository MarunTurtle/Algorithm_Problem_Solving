import java.util.*;

public class Solution {
    public String solution (String myStr, String alp) {
        
        int len = myStr.length();
        
        String[] result = myStr.split("");
        
        for (int i = 0; i < len; i++) {
            if (result[i].equals(alp)) {
                result[i] = result[i].toUpperCase();
            }
        }
        
        return String.join("", result);
    }
}