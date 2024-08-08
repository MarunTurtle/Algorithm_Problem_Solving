import java.util.Stack;
import java.util.Scanner;

public class Solution {
    // 연산자 우선순위를 반환하는 함수
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
                return 1;
            case '*':
                return 2;
        }
        return -1;
    }

    // 중위 표기식을 후위 표기식으로 변환하는 함수
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            // 피연산자일 경우 결과에 추가
            if (Character.isDigit(c)) {
                result.append(c);
            } 
            // '('를 스택에 추가
            else if (c == '(') {
                stack.push(c);
            } 
            // ')'를 만나면 '('를 만날 때까지 스택에서 팝
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } 
            // 연산자일 경우
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        // 스택에 남아있는 모든 연산자를 결과에 추가
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        return result.toString();
    }

    // 후위 표기식을 계산하는 함수
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            // 피연산자일 경우 스택에 추가
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } 
            // 연산자일 경우 스택에서 두 숫자를 꺼내 계산 후 결과를 다시 스택에 추가
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                
                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        
        // 최종 결과를 반환
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int t = 1; t <= 10; t++) {
            int length = scanner.nextInt();
            String expression = scanner.next();
            
            String postfix = infixToPostfix(expression);
            int result = evaluatePostfix(postfix);
            
            System.out.println("#" + t + " " + result);
        }
        
        scanner.close();
    }
}
