import java.util.*;

public class Solution {
    public int solution (String number) {
        
        int result = 0;
        
        for (char c : number.toCharArray()) {
            result += c - '0';            
        }
        
        return result % 9;
    }    
}
