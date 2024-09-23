import java.util.*;

public class Solution {
    public int[] solution (int[] arr) {
        
        Deque<Integer> stk = new ArrayDeque<>();
        
        for (int num : arr) {
            
            if (stk.isEmpty()) {
                stk.push(num);
            }
            
            while (!stk.isEmpty() && num <= stk.peek()) {
                stk.poll();
            }
            
            stk.push(num);

        }
        
        int[] result = new int[stk.size()];
        int idx = stk.size() - 1;
        
        for (int num : stk) {
            result[idx--] = num;
        }
        
        return result;
    }
}