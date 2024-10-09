import java.util.*;

public class Solution {
    public String solution (String myStr, String alp) {
        String[] result = myStr.split("");
        
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals(alp)) {
                result[i] = result[i].toUpperCase();
            }
        }
        
        return String.join("", result);
    }
}