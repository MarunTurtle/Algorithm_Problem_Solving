import java.util.*;

public class Solution {
    public int[] solution (int[] arr) {
        
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            while (!stk.isEmpty() && stk.peek() >= arr[i]) {
                stk.pop();
            }
            stk.push(arr[i]);
        }
        
        return stk.stream().mapToInt(i -> i).toArray();
        
    }
}