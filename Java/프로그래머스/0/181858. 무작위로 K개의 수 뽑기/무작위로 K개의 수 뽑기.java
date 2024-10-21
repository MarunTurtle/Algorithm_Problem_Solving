import java.util.*;

public class Solution {
    public int[] solution (int[] arr, int k) {
        
        int[] result = new int[k];
        Arrays.fill(result, -1);
        
        HashSet<Integer> seen = new HashSet<>();
        
        int len = arr.length;
        
        for (int i = 0, j = 0; i < len && j < k; i++) {
            if (!seen.contains(arr[i])) {
                result[j++] = arr[i];
                seen.add(arr[i]);
            }
        }
        
        return result;
            
    }
}