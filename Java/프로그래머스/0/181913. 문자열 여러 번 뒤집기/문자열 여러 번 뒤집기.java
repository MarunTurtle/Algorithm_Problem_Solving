import java.util.*;

public class Solution {
    public String solution(String str, int[][] queries) {
        
        StringBuilder result = new StringBuilder(str);
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            StringBuilder substr = new StringBuilder(result.toString().substring(s, e + 1));
            
            result.replace(s, e + 1, substr.reverse().toString());
        }
        
        return result.toString();
    }
}
