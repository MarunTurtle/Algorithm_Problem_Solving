import java.util.*;

public class Solution {
    public int[] solution (int[] arr) {
        
        Deque<Integer> stk = new ArrayDeque<>();
        
        int len = arr.length;
        
        for (int i = 0; i < len; i++) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
            } else if (stk.peek() == arr[i]) {
                stk.pop();
            } else {
                stk.push(arr[i]);
            }
        }
        
        if (stk.isEmpty()) return new int[] {-1};
        
        int[] result = new int[stk.size()];
        int j = stk.size()-1;
        while (!stk.isEmpty()) {
            result[j--] = stk.pop();
        }
        
        return result;
    }
}