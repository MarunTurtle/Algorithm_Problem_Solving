import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String myString) {
        // Split the string using "x" as the delimiter
        String[] parts = myString.split("x");
        
        // Filter out empty strings, sort the remaining strings lexicographically,
        // and collect them into a list
        List<String> filteredAndSorted = Arrays.stream(parts)
                                               .filter(s -> !s.isEmpty())  // Remove empty strings
                                               .sorted()                   // Sort lexicographically
                                               .collect(Collectors.toList());
        
        // Convert the list back to an array and return it
        return filteredAndSorted.toArray(new String[0]);
    }
}
