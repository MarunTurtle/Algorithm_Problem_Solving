import java.util.*;

public class Solution {
    public int[] solution (int s, int e) {
        
        int[] arr = new int[s - e + 1];
        
        for (int i = s, j = 0; i >= e; i--) {
            arr[j++] = i;
        }
        
        return arr;
    }
}