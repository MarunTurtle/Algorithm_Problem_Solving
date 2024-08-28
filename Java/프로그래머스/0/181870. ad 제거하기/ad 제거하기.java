import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        // Declare pattern
        String pat = "ad";
        
        // Use ArrayList for dynamic size
        List<String> resultList = new ArrayList<>();
        
        //Iterate through all strings in strArr
        for (String curString : strArr) {
            if (!curString.contains(pat)) {
                resultList.add(curString);
            }            
        }
        
        return resultList.toArray(new String[0]);
        
    }
}