import java.util.*;

public class Solution {
    public int[] solution (int arr[], int k) {
        
        int[] result = new int[k];
        Arrays.fill(result, -1);
        
        Set<Integer> seen = new HashSet<>();
        
        for (int i = 0, j = 0; i < arr.length && j < k; i++) {
            if (!seen.contains(arr[i])) {
                seen.add(arr[i]);
                result[j++] = arr[i];
            }
        }
            
        return result;
    }
}