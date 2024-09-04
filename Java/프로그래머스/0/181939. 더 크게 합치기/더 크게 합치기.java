import java.util.*;

public class Solution {
    public int solution (int a, int b) {
        
        int n = Integer.parseInt("" + a + b);
        int m = Integer.parseInt("" + b + a);
        
        return Math.max(n, m);
        
    }
}