import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10개의 테스트 케이스를 순회
        for (int caseNum = 1; caseNum <= 10; caseNum++) {
            int length = scanner.nextInt(); // 식의 길이를 읽음
            String infixExpr = scanner.next(); // 중위 표기식을 읽음

            // 중위 표기식을 후위 표기식으로 변환
            String postfixExpr = convertToPostfix(infixExpr, length);
            // 후위 표기식을 평가
            int result = evaluatePostfix(postfixExpr, length);

            // 결과를 출력
            System.out.println("#" + caseNum + " " + result);
        }

        scanner.close();
    }

    // 중위 표기식을 후위 표기식으로 변환하는 함수
    public static String convertToPostfix(String infix, int length) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        // 스택 초기 용량 설정
        stack.ensureCapacity(length);

        for (int i = 0; i < infix.length(); i++) {
            char currChar = infix.charAt(i);

            // 문자가 숫자인 경우 결과에 추가
            if (Character.isDigit(currChar)) {
                postfix.append(currChar);
            }
            // 문자가 '('인 경우 스택에 푸시
            else if (currChar == '(') {
                stack.push(currChar);
            }
            // 문자가 ')'인 경우 '('를 만날 때까지 팝하여 결과에 추가
            else if (currChar == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // 스택에서 '(' 제거
            }
            // 연산자를 만난 경우
            else if (currChar == '+' || currChar == '*') {
                while (!stack.isEmpty() && getPriority(currChar) <= getPriority(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(currChar);
            }
        }

        // 스택의 모든 연산자를 팝하여 결과에 추가
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // 후위 표기식을 평가하는 함수
    public static int evaluatePostfix(String postfix, int length) {
        Stack<Integer> stack = new Stack<>();
        
        // 스택 초기 용량 설정
        stack.ensureCapacity(length);

        for (int i = 0; i < postfix.length(); i++) {
            char currChar = postfix.charAt(i);

            // 문자가 숫자인 경우 스택에 푸시
            if (Character.isDigit(currChar)) {
                stack.push(currChar - '0');
            }
            // 문자가 연산자인 경우 두 요소를 팝하여 연산 적용
            else if (currChar == '+' || currChar == '*') {
                int num1 = stack.pop();
                int num2 = stack.pop();

                if (currChar == '+') {
                    stack.push(num2 + num1);
                } else if (currChar == '*') {
                    stack.push(num2 * num1);
                }
            }
        }

        // 최종 결과는 스택의 유일한 요소
        return stack.pop();
    }

    // 연산자의 우선순위를 반환하는 함수
    public static int getPriority(char oper) {
        if (oper == '+') {
            return 1;
        } else if (oper == '*') {
            return 2;
        }
        return -1;
    }
}
