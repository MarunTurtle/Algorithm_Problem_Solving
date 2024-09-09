import java.util.*;

public class Solution {
    public int solution (int a, int b) {
        
        int n = Integer.parseInt("" + a + b);
        int m = 2 * a * b;
        
        return n > m ? n : m;
        
    }
}