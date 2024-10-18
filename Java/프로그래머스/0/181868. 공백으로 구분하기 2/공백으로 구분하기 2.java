import java.util.*;

public class Solution {
    public String[] solution (String myStr) {
        
        StringTokenizer st = new StringTokenizer(myStr);
        int n = st.countTokens();
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            result[i] = st.nextToken();
        }
        
        return result;
    }
}