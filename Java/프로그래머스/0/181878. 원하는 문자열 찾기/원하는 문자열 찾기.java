import java.util.*;

public class Solution {
    public int solution (String myStr, String pat) {
        myStr = myStr.toLowerCase();
        pat = pat.toLowerCase();
        
        return myStr.contains(pat) ? 1 : 0;
    }
}