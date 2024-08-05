import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int TC = sc.nextInt();  // Read the number of test cases
        for (int t = 1; t <= TC; t++) {
            int K = sc.nextInt();  // Read the number of integers for this test case
            Stack<Integer> stack = new Stack<>();  // Stack to manage the numbers

            for (int i = 0; i < K; i++) {
                int num = sc.nextInt();
                if (num == 0) {
                    if (!stack.isEmpty()) {
                        stack.pop();  // Remove the most recent number if the input is 0
                    }
                } else {
                    stack.push(num);  // Add the number to the stack
                }
            }
            
            int sum = 0;
            for (int value : stack) {
                sum += value;  // Calculate the sum of numbers remaining in the stack
            }
            
            System.out.println("#" + t + " " + sum);  // Output the result for the test case
        }
        
        sc.close();  // Close the scanner
    }
}
