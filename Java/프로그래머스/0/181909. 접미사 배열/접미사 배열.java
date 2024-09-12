import java.util.*;

public class Solution {
    public String[] solution (String my_string) {
        
        ArrayList<String> result = new ArrayList<>();
        
        int len = my_string.length();
        
        for (int i = 0; i < len; i++) {
            result.add(my_string.substring(i));
        }
        
        return result.stream().sorted().toArray(String[]::new);       
    }
}