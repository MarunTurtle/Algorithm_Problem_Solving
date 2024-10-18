import java.util.*;

public class Solution {
    public int[] solution (int[] arr) {
    
        List<Integer> result = new ArrayList<>();
        int len = arr.length;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < arr[i]; j++) {
                result.add(arr[i]);
            }
        }
    
        // Better to pass an array of the required size
        return result.stream().mapToInt(i -> i).toArray();
    }
}
