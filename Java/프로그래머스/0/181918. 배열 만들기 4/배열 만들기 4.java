// import java.util.*;

// class Solution {
//     public int[] solution (int[] arr) {
        
//         Deque<Integer> stack = new ArrayDeque<>();
        
//         for (int num : arr) {
//             while (!stack.isEmpty() && stack.peek() >= num) {
//                 stack.pop();
//             }
//             stack.push(num);
//         }
        
//         return stack.stream().sorted().mapToInt(i -> i).toArray();
//     }
// 

import java.util.*;

public class Solution {
    public int[] solution (int[] arr) {
        
        Deque<Integer> stk = new ArrayDeque<>();
            
        for (int i = 0; i < arr.length; i++) {
            
            // Add first element if stack is empty
            if (stk.isEmpty()) {
                stk.push(arr[i]);
                continue;
            }
            
            // Remove elements from the stack while they are less than or equal to the current element
            while (!stk.isEmpty() && arr[i] <= stk.peek()) {
                stk.poll();
            }
            
            // Add the current element to the stack
            stk.push(arr[i]);
        }
        
        // Return the stack elements as an array
        // Note that the stack contains elements in reverse order, so we need to reverse it
        int[] result = new int[stk.size()];
        int index = stk.size() - 1;
        
        for (int num : stk) {
            result[index--] = num;
        }
        
        return result;
    }
}
