import java.util.*;

class Solution {
    public int[] solution(int s, int e) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = s; i >= e; i--) {
            result.add(i);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}