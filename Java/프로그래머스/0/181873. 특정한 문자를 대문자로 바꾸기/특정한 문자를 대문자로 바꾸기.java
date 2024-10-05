import java.util.*;

public class Solution {
    public String solution(String myStr, String alp) {
        
        String[] myStrArr = myStr.split("");
        
        for (int i = 0; i < myStr.length(); i++) {
            if (myStrArr[i].equals(alp)) {
                myStrArr[i] = myStrArr[i].toUpperCase();
            }
        }
        
        return String.join("", myStrArr);
    }
}