import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        // Declare stk as a Deque (double-ended queue)
        Deque<Integer> stk = new ArrayDeque<>();        
        
        // Iterate through elements in arr
        for (int i = 0; i < arr.length; i++) {
            // If the stack is empty, push arr[i]
            if (stk.isEmpty()) {
                stk.push(arr[i]);
            // If the top of the stack is the same as arr[i], pop the stack
            } else if (stk.peek() == arr[i]) {
                stk.pop();
            // If the top of the stack is different, push arr[i]
            } else {
                stk.push(arr[i]);
            }
        }
        
        // If the stack is empty after processing, add -1
        if (stk.isEmpty()) {
            stk.push(-1);
        }
        
        // Convert the stack to an array to return
        int[] result = new int[stk.size()];
        int i = stk.size() - 1;
        while (!stk.isEmpty()) {
            result[i--] = stk.pop();
        }
        
        return result;
    }
}
