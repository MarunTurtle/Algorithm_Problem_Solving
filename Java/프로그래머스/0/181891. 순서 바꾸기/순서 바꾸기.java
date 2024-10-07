import java.util.*;

public class Solution {
    public int[] solution (int[] num, int n) {
        
        int len = num.length;
        
        int[] result = new int[len];
        
        System.arraycopy(num, n, result, 0, len - n);
        
        System.arraycopy(num, 0, result, len - n, n);
        
        return result;
        
    }
}