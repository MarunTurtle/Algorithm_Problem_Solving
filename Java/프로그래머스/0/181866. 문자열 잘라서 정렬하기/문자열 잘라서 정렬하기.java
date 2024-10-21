import java.util.*;

public class Solution {
    public String[] solution (String myStr) {
        
        StringTokenizer st = new StringTokenizer(myStr, "x");
        int len = st.countTokens();
        String[] result = new String[len];
        
        for (int i = 0; i < len; i++) {
            result[i] = st.nextToken();
        }
        
        Arrays.sort(result);
        
        return result;
        
    }
}