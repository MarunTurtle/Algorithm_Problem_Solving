import java.util.*;

public class Solution {
    public String[] solution(String myStr) {
        StringTokenizer st = new StringTokenizer(myStr);
        int N = st.countTokens();
        String[] result = new String[N];
        
        for (int i = 0; i < N; i++) {
            result[i] = st.nextToken();
        }
        
        return result;
    }
}