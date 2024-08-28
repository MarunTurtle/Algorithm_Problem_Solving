import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        // Initialize StringBuilder for accumulating substrings
        StringBuilder substring = new StringBuilder();        
        
        // Initialize ArrayList to store the substrings
        ArrayList<String> list = new ArrayList<>();
        
        // Iterate through each character in myStr
        for (int i = 0; i < myStr.length(); i++) {
            switch (myStr.charAt(i)) {
                case 'a': 
                case 'b': 
                case 'c':
                    // Add the current substring to the list if it's not empty
                    if (substring.length() > 0) {
                        list.add(substring.toString());
                    }
                    // Reset the StringBuilder for the next substring
                    substring = new StringBuilder();
                    break;
                default:
                    // Append the current character to the substring
                    substring.append(myStr.charAt(i));
                    break;
            }
        }
        
        // Add the last accumulated substring if it exists
        if (substring.length() > 0) {
            list.add(substring.toString());
        }
        
        // Handle the case when the list is empty
        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        }
        
        // Convert the ArrayList to an array and return
        return list.toArray(new String[0]);
    }
}
