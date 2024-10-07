import java.util.*;

public class Solution {
    public String[] solution (String[] strArr) {
        
        int len = strArr.length;
        
        for (int i = 0; i < len; i++) {
            if (strArr[i].equals("l")) {
                return Arrays.copyOfRange(strArr, 0, i);
            } else if (strArr[i].equals("r")) {
                return Arrays.copyOfRange(strArr, i+1, len);
            }
        }
        
        return new String[] {};
    }
}