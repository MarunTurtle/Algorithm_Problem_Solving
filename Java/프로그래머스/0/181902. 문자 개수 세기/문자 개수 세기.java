import java.util.*;

public class Solution {
    public int[] solution (String str) {
//      String[] strArr = str.split("");
        
        int[] arr = new int[52];
        
        for (char c : str.toCharArray()) {
            
            if (Character.isUpperCase(c)) {
                
                int idx = c - 'A';
                arr[idx] += 1;
                
            } else {
                
                int idx = c - 'a' + 26; 
                arr[idx] += 1;
            }
            
        }
        
        return arr;
        
    }
}