import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        // Initialize a Stack to store the elements
        Stack<Integer> stk = new Stack<>();
        int i = 0;  // Initialize the index to start from the first element of arr

        // Loop through the array
        while (i < arr.length) {
            // If the stack is empty or the current element is greater than the top element of the stack
            if (stk.isEmpty() || stk.peek() < arr[i]) {
                stk.push(arr[i]);  // Push the current element onto the stack
                i++;  // Move to the next element in arr
            } else {
                stk.pop();  // Pop the top element from the stack if the current element is less than or equal to the top element
            }
        }

        // Convert the stack to an int array
        int[] result = new int[stk.size()];  // Create an array of the same size as the stack
        for (int j = result.length - 1; j >= 0; j--) {
            result[j] = stk.pop();  // Pop elements from the stack into the array in reverse order
        }

        return result;  // Return the result array
    }
}
