import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] solution(int[] arr) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : arr) {
            // Ensure stack contains only elements in increasing order
            while (!stack.isEmpty() && num <= stack.peek()) {
                stack.pop();
            }
            stack.push(num);
        }

        // Convert Deque to int[]
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}