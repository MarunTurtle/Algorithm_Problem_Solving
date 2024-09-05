import java.util.*;

public class Solution {
    public int solution (int a, int b) {
     
        int m = Integer.parseInt("" + a + b);
        int n = Integer.parseInt("" + b + a);
        
        return m > n ? m : n; 
        
    }
}