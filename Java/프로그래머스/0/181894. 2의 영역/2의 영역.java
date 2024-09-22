import java.util.*;

public class Solution {
    public int[] solution (int[] arr) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
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
        
        for (int j = s; j <= e; j++) {
            result.add(arr[j]);
        }     
        
        return result.stream().mapToInt(i -> i).toArray();                
    }
}
