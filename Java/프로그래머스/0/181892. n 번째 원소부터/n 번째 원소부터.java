import java.util.*;

public class Solution {
    public int[] solution (int[] num, int n) {
        int len = num.length;
        
        return Arrays.copyOfRange(num, n-1, len);
        
        
    }
}