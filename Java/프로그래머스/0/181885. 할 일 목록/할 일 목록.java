import java.util.*;

public class Solution {
    
    public static int len;
    
    public String[] solution (String[] todo, boolean[] finished) {
        
        ArrayList<String> result = new ArrayList<>();
        
        len = finished.length;
        
        for (int i = 0; i < len; i++) {
            if (!finished[i]) {
                result.add(todo[i]);
            }
        }
        
        return result.toArray(new String[0]);
            
    }
}