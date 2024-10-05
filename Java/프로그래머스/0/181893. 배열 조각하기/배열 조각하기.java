import java.util.*;

public class Solution {
    
    static int s;
    static int e;
    
    public int[] solution (int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                e = s + query[i];
            } else {
                s = s + query[i];
            }
        }   
        
        return Arrays.copyOfRange(arr, s, e+1);
    }
}