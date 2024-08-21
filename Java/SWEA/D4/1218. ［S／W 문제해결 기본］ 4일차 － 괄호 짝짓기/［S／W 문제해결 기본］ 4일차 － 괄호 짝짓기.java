import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = 10; // Assuming 10 test cases

        for (int test_case = 1; test_case <= T; test_case++) {
            int length = sc.nextInt();
            sc.nextLine(); // consume the newline
            String brackets = sc.nextLine();
            
            boolean isValid = validateBrackets(brackets, length);
            System.out.println("#" + test_case + " " + (isValid ? 1 : 0));
        }
    }

    private static boolean validateBrackets(String brackets, int length) {
        Stack stack = new Stack(length);
        for (int i = 0; i < length; i++) {
            char ch = brackets.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                case '<':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case '>':
                    if (stack.isEmpty() || stack.pop() != '<') return false;
                    break;
                default:
                    // Ignore non-bracket characters (if any)
                    break;
            }
        }
        return stack.isEmpty();
    }

    static class Stack {
        private char[] stackArray;
        private int top;
        private int maxSize;

        public Stack(int size) {
            maxSize = size;
            stackArray = new char[maxSize];
            top = -1;
        }

        public void push(char value) {
            if (top < maxSize - 1) {
                stackArray[++top] = value;
            }
        }

        public char pop() {
            return top == -1 ? '\0' : stackArray[top--];
        }

        public char peek() {
            return top == -1 ? '\0' : stackArray[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }
}
