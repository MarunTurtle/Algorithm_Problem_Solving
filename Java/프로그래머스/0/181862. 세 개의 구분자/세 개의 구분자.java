import java.util.*;

public class Solution {
    public String[] solution (String myStr) {
        
        StringBuilder sb = new StringBuilder();
        ArrayList<String> result = new ArrayList<>();
        int len = myStr.length();
        
        for (int i = 0; i < len; i++) {
            char c = myStr.charAt(i);
            if (c != 'a' && c != 'b' && c != 'c') {
                sb.append(c);
            } else if (sb.length() != 0) {
                result.add(sb.toString());
                sb.setLength(0);
            }
        }
        
        result.add(sb.toString());
        
        if (sb.length() == 0) {
            return new String[] {"EMPTY"};
        }
        
        return result.toArray(new String[0]);
    }
}