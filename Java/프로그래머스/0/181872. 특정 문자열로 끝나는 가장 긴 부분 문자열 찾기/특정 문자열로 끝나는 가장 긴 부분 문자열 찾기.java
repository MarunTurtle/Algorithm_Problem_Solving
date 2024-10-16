import java.util.*;

public class Solution {
    public String solution (String myStr, String pat) {
        
        int len = pat.length();
        
        int idx = myStr.lastIndexOf(pat);
        
        return myStr.substring(0, len + idx);
        
    }
}