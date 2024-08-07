import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            while (!stack.isEmpty() && num <= stack.peek())
                stack.pop();
            stack.push(num);
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}