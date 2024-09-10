import java.util.*;

public class Solution {
    public int[] solution (int l, int r) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < 64; i++) {
            int n = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= n && n <= r) {
                result.add(n);          
            }
        }
        
        if (result.isEmpty()) {
            result.add(-1);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}