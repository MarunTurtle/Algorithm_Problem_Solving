import java.util.*;

public class Solution {
    public int solution(String[] strArr) {
        
        Map<Integer, Integer> lengthMap = new HashMap<>();
        
        for (String str : strArr) {
            int len = str.length();
            lengthMap.put(len, lengthMap.getOrDefault(len, 0) + 1);
        }
        
        int maxCount = 0;
        for (int count : lengthMap.values()) {
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}