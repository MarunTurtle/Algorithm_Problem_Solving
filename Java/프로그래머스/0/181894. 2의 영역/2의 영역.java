import java.util.*;

public class Solution {
    
    static int s;
    static int e;
    static int i;
    static int len;
    
    public int[] solution(int[] arr) {
        
        s = -1;
        e = -1;
        i = 0;
        len = arr.length;
        
        while (i < len) {
            if (arr[i] == 2) {
                if (s == -1) {
                    s = i;
                } else {
                    e = i;
                }
            }
            i++;
        }
        
        if (s == -1) {
            return new int[] {-1};
        } else if (e == -1) {
            return new int[] {2};
        }
        
        return Arrays.copyOfRange(arr, s, e+1);
    }
}