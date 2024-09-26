import java.util.*;

public class Solution {
    public int[] solution (int n, int k) {
        int[] result = new int[n/k];
        
        for (int i = k, j = 0; i <= n; i += k) {
            result[j++] = i;
        }
        
        return result;
    }
}