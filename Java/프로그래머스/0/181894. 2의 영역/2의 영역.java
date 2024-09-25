import java.util.*;

public class Solution {
    public int[] solution (int[] arr) {
        
        int s = -1;
        int e = -1;
        int len = arr.length;
        
        for (int i = 0; i < len; i++) {
            if (arr[i] == 2) {
                if (s == -1) {
                    s = i;
                }
                e = i;
            }
        }
        
        if (s == -1) {
            return new int[]{-1};
        }
        
        int[] result = new int[e - s + 1];
        
        System.arraycopy(arr, s, result, 0, e - s + 1);
        
        return result;
        
    }
}