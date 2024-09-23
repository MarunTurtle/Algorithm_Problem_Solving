import java.util.*;

public class Solution {
    public int[] solution (String my_string) {
        
        int[] alphabets = new int[52];
        
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                alphabets[c - 'A'] += 1;
            } else {
                alphabets[c - 'a' + 26] += 1;
            }
        }
        
        return alphabets;
    }
}