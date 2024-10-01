import java.util.*;

public class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int len = intStrs.length;
        int idx = 0;
        
        while (idx < len) {
            int num = Integer.parseInt(intStrs[idx].substring(s, s+l).toString());
            if (num > k) result.add(num);
            idx++;
        }
        
        return result.stream().mapToInt(i -> i).toArray();     
        
    }
}