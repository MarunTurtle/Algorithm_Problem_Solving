import java.util.*;

public class Solution {
    public String solution (String my_string, int[][] queries) {
        
        StringBuilder result = new StringBuilder(my_string);
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            StringBuilder subStr = new StringBuilder(result.substring(s, e+1));
            result.replace(s, e+1, subStr.reverse().toString());
        }
        
        return result.toString();
    }
}