import java.util.*;

public class Solution {
    public String[]solution(String[] strArr) {
        
        int len = strArr.length;
        
        for (int i = 0; i < len; i++) {
            if (i % 2 == 1) {
                strArr[i] = strArr[i].toUpperCase();
            } else {
                strArr[i] = strArr[i].toLowerCase();
            }
        }
        
        return strArr;        
    }
}