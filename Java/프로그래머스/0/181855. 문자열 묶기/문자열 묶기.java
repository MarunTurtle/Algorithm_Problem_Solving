import java.util.*;

public class Solution {
    public int solution (String[] strArr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (String str : strArr) {
            map.put(str.length(), map.getOrDefault(str.length(), 0) + 1);
        }
        
        int maxLen = 0;
        for (int value : map.values()) {
            maxLen = Math.max(maxLen, value);
        }
        
        return maxLen;
    }
}