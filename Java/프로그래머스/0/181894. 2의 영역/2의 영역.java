import java.util.*;

public class Solution {
    public int[] solution (int[] arr) {
        
        int len = arr.length;
        int s = -1;
        int e = -1;
         
        for (int i = 0; i < len; i++) {
            if (arr[i] == 2) {
                if (s == -1) {
                    s = i;
                } else {
                    e = i;
                }
            }
        }
        
        if (s == -1) {
            return new int[] {-1};
        } else if (e == -1) {
            return Arrays.copyOfRange(arr, s, s+1);            
        } else {
            return Arrays.copyOfRange(arr, s, e+1);
        }
    }
}