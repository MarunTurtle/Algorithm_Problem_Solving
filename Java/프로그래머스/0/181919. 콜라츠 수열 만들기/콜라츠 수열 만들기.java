
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> collatz = new ArrayList<>();
        runCollatz(n, collatz);
        return collatz.stream().mapToInt(i -> i).toArray();

    }

    private void runCollatz(int n, ArrayList<Integer> collatz) {
        collatz.add(n);
        
        if (n == 1) {
            return;
        } else if (n % 2 == 0) {
            runCollatz(n / 2, collatz);
        } else if (n % 2 == 1) {
            runCollatz(3 * n + 1, collatz);
        }
    }
}