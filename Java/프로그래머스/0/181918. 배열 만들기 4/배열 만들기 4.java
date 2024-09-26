import java.util.*;

public class Solution {
    public int[] solution (int[] arr) {
        
        ArrayDeque<Integer> stk = new ArrayDeque<>();
        
        for (int num : arr) {
            
            if (stk.isEmpty()) {
                stk.push(num);
                continue;
            }
            
            while (!stk.isEmpty() && stk.peek() >= num) {
                stk.pop();
            }
            
            stk.push(num);

        }
        
        int size = stk.size();
        
        int[] result = new int[size];
        
        for (int i = size-1; i >= 0; i--) {
            result[i] = stk.pop();
        }
            
        return result;
    }
}