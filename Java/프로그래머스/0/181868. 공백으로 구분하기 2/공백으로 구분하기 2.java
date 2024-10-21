import java.util.*;

public class Solution {
    public String[] solution (String myStr) {
        StringTokenizer st = new StringTokenizer(myStr);
        int count = st.countTokens();
        
        String[] result = new String[count];
        
        for (int i = 0; i < count; i++) {
            result[i] = st.nextToken();
        }
        
        return result;
    }
}