import java.util.*;

public class Solution {
    public int[] solution (int[] arr, int[] query) {
        
        int len = arr.length;
        int s = 0;
        int e = len-1;
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                e -= e - s - query[i];
            } else {
                s += query[i];
            }
        }
        
        return Arrays.copyOfRange(arr, s, e+1);
        
    }
}