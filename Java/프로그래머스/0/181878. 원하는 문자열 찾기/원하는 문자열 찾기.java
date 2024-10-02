import java.util.*;

public class Solution {
    public int solution (String str, String pat) {
        
        str = str.toLowerCase();
        pat = pat.toLowerCase();
        
        return str.contains(pat) ? 1 : 0;
        
    }
}