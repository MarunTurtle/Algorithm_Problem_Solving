import java.util.*;

public class Solution {
    public String[] solution (String myStr) {
        
        String[] parts = myStr.split("x");
               
        List<String> newParts = new ArrayList<>();
        
        for (String part : parts) {
            if (!part.equals("")) {
                newParts.add(part);
            }
        }
        
        String[] result = newParts.toArray(new String[0]);
        Arrays.sort(result);
        
        return result;
    }
}