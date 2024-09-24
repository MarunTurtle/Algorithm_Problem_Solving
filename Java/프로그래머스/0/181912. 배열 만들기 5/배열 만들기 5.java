import java.util.*;

public class Solution {
    public int[] solution (String[] intStrs, int k, int s, int l) {
               
        ArrayList<Integer> result = new ArrayList<>();
        
        for (String intStr : intStrs) {
            
            int subint = Integer.parseInt(intStr.substring(s, s + l));
            
            if (subint > k) result.add(subint);
            
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }        
}