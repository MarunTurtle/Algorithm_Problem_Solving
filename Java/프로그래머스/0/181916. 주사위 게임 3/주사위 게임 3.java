import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int solution(int a, int b, int c, int d) {
        // 주사위 결과를 배열에 저장하고 정렬
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        // 정렬된 배열을 큐에 삽입
        Deque<Integer> diceQueue = new ArrayDeque<>();
        for (int value : dice) {
            diceQueue.offer(value);
        }
        
        // 주사위 결과가 모두 같은 경우
        if (diceQueue.peekFirst().equals(diceQueue.peekLast())) {
            return 1111 * diceQueue.peekFirst();
        }
        
        // 주사위 결과가 세 개가 같고, 나머지 하나가 다른 경우
        int first = diceQueue.poll();
        int second = diceQueue.poll();
        int third = diceQueue.poll();
        int fourth = diceQueue.poll();
        
        if (first == second && second == third) {
            return (int) Math.pow(10 * first + fourth, 2);
        } else if (second == third && third == fourth) {
            return (int) Math.pow(10 * second + first, 2);
        }
        
        // 주사위 결과가 두 개씩 같은 경우
        if (first == second && third == fourth) {
            return (first + third) * Math.abs(first - third);
        }
        
        // 두 개는 같은 숫자이고 나머지 두 개는 다른 경우
        if (first == second) {
            return third * fourth;
        } else if (second == third) {
            return first * fourth;
        } else if (third == fourth) {
            return first * second;
        }
        
        // 네 주사위 결과가 모두 다른 경우
        return first; // 이미 정렬되었으므로 첫 번째 요소가 가장 작음
    }
}
