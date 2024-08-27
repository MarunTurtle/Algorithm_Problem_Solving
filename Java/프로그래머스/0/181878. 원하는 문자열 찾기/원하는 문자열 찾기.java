import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();    
        
        // Check if myString contains the pattern
        return (myString.contains(pat)) ? 1 : 0;
    }
}