import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        
        // Declare pattern
        String pat = "ad";
        
        // Use ArrayList for dynamic size
        List<String> resultList = new ArrayList<>();
        
        // Iterate through all strings in strArr
        for (String curString : strArr) {
            // If the current string does not contain the pattern, add it to the list
            if (!curString.contains(pat)) {
                resultList.add(curString);
            }
        }
        
        // Convert ArrayList back to an array
        return resultList.toArray(new String[0]);
    }
}
