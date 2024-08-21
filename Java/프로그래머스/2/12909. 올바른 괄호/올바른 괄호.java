import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    // 주어진 괄호 문자열의 유효성을 확인하는 메소드
    boolean solution(String brackets) {
        
        // 괄호 문자열의 길이 설정
        int length = brackets.length();
        
        // bracketsCheck 메소드를 통해 괄호 문자열이 유효한지 여부를 판단
        boolean answer = bracketsCheck(brackets, length);
        return answer;
    }
    
    // 괄호 유효성을 체크하는 메소드
    private static boolean bracketsCheck(String brackets, int length) {

        // 스택을 사용하여 괄호의 짝을 확인
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            char ch = brackets.charAt(i);
            switch (ch) {
                // 여는 괄호가 오면 스택에 추가
                case '(', '[', '{', '<' -> stack.push(ch);
                
                // 닫는 괄호가 올 때, 스택이 비어있거나 짝이 맞지 않으면 false 반환
                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                }
                case '>' -> {
                    if (stack.isEmpty() || stack.pop() != '<') return false;
                }
                
                // 괄호가 아닌 다른 문자가 오면 무시
                default -> {
                } 
            }
        }
        
        // 모든 괄호를 처리한 후 스택이 비어있으면 true, 그렇지 않으면 false 반환
        return stack.isEmpty();
    }
}
