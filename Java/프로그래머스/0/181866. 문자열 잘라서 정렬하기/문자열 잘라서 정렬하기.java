import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String myString) {
        // Split the string using "x" as the delimiter
        String[] parts = myString.split("x");
        
        // Filter out empty strings, sort the remaining strings lexicographically,
        // and collect them into a list
        return Arrays.stream(parts)
                     .filter(s -> !s.isEmpty())  // Remove empty strings
                     .sorted()                   // Sort lexicographically
                     .toArray(String[]::new);
    }
}
