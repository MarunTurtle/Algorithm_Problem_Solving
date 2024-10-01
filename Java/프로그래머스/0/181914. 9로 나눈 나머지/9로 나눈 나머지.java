import java.util.*;

public class Solution {
    public int solution (String num) {
        
        int sum = 0; 
        int i = 0;
        
        while (i < num.length()) {
            sum += num.charAt(i) - '0';
            i++;
        }
        
        return sum % 9;
    }
}