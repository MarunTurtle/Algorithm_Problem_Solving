// import java.util.Stack;

// class Solution {
//     public int[] solution(int[] arr) {
//         // Initialize a Stack to store the elements
//         Stack<Integer> stk = new Stack<>();
//         int i = 0;  // Initialize the index to start from the first element of arr

//         // Loop through the array
//         while (i < arr.length) {
//             // If the stack is empty or the current element is greater than the top element of the stack
//             if (stk.isEmpty() || stk.peek() < arr[i]) {
//                 stk.push(arr[i]);  // Push the current element onto the stack
//                 i++;  // Move to the next element in arr
//             } else {
//                 stk.pop();  // Pop the top element from the stack if the current element is less than or equal to the top element
//             }
//         }

//         // Convert the stack to an int array
//         return stk.stream().mapToInt(j -> j).toArray();
//     }
// }


// import java.util.Stack;

// class Solution {
//     public int[] solution(int[] arr) {

//         Stack<Integer> stack = new Stack<>();

//         for (int num : arr) {
//             while (!stack.isEmpty() && num <= stack.peek())
//                 stack.pop();
//             stack.push(num);
//         }

//         return stack.stream().mapToInt(i -> i).toArray();
//     }
// }


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
// }



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
