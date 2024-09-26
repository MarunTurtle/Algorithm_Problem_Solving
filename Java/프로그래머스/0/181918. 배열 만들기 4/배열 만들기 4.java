import java.util.*;

public class Solution {
    public int[] solution (int[] arr) {
        
        ArrayDeque<Integer> stk = new ArrayDeque<>();
        
        for (int num : arr) {
            
            while (!stk.isEmpty() && stk.peek() >= num) {
                stk.pop();
            }
            
            stk.push(num);
        }
        
        int[] result = new int[stk.size()];
        
        for (int i = stk.size()-1; i >= 0; i--) {
            result[i] = stk.pop();
        }
        
        return result;
    }
}