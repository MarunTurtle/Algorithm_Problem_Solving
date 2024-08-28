import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        // Use regular expression to split the string based on 'a', 'b', or 'c'
        String[] result = myStr.split("[abc]+");

        // Filter out any empty strings and return the result
        String[] filteredResult = Arrays.stream(result)
                                        .filter(s -> !s.isEmpty())
                                        .toArray(String[]::new);

        // Handle the case when the resulting array is empty
        if (filteredResult.length == 0) {
            return new String[]{"EMPTY"};
        }

        return filteredResult;
    }
}


// class Solution {
//     public String[] solution(String myStr) {
//         // Initialize StringBuilder for accumulating substrings
//         StringBuilder substring = new StringBuilder();        
        
//         // Initialize ArrayList to store the substrings
//         ArrayList<String> list = new ArrayList<>();
        
//         // Iterate through each character in myStr
//         for (int i = 0; i < myStr.length(); i++) {
//             char currentChar = myStr.charAt(i);
//             if (currentChar == 'a' || currentChar == 'b' || currentChar == 'c') {
//                 // Add the current substring to the list if it's not empty
//                 if (substring.length() > 0) {
//                     list.add(substring.toString());
//                     // Clear the StringBuilder for the next substring
//                     substring.setLength(0);
//                 }
//             } else {
//                 // Append the current character to the substring
//                 substring.append(currentChar);
//             }
//         }
        
//         // Add the last accumulated substring if it exists
//         if (substring.length() > 0) {
//             list.add(substring.toString());
//         }
        
//         // Handle the case when the list is empty
//         if (list.isEmpty()) {
//             return new String[]{"EMPTY"};
//         }
        
//         // Convert the ArrayList to an array and return
//         return list.toArray(new String[0]);
//     }
// }
