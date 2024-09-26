import java.util.*;

public class Solution {
    public int[] solution (String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (String intStr : intStrs) {
            
            String intSub = intStr.substring(s, s+l);
            
            int num = Integer.parseInt(intSub);
            
            if (num > k) result.add(num);
        }        
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}