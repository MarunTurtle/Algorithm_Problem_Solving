import java.util.*;

public class Solution {
    public String[] solution(String my_str) {
        
        int len = my_str.length();        
        
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < len; i++) {
            
            result.add(my_str.substring(i));
            
        }
        
        return result.stream().sorted().toArray(String[]::new);
        
    }
}