import java.util.*;

class Solution {
    public int[] solution (int[] arr) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int num : arr) {
            while (!stack.isEmpty() && stack.peek() >= num) {
                stack.pop();
            }
            stack.push(num);
        }
        
        return stack.stream().sorted().mapToInt(i -> i).toArray();
    }
}