import java.util.*;

public class Solution {
    public int[] solution (String myStr) {
        
        int len = myStr.length();
        int count = 0;
        
        List<Integer> arr = new ArrayList<>();
            
        for (int i = 0; i < len; i++) {
            if (myStr.charAt(i) == 'x') {
                arr.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        arr.add(count);
        
        return arr.stream().mapToInt(i -> i).toArray();
    }
}