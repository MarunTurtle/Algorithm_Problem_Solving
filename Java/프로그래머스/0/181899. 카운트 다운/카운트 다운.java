import java.util.*;

public class Solution {
    public int[] solution (int s, int e) {
        
        int[] result = new int[s - e + 1];
        int idx = 0;
        
        for (int i = s; i >= e; i--) {
            result[idx++] = i;
        }
        
        return result;
    }
}