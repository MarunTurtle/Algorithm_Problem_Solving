import java.util.*;

public class Solution {
    public int[] solution (int[] num, int n) {
        int len = num.length;
        
        int[] result = new int[(len - 1 + n)/n];
        
        for (int i = 0, j = 0; i < len; i += n) {
            result[j++] = num[i];
        }
        
        return result;
    }
}