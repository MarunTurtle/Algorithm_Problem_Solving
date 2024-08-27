class Solution {
    public String solution(String my_string, int s, int e) {
        // Extract the substring that needs to be reversed
        StringBuilder subString = new StringBuilder(my_string.substring(s, e + 1));
       
        // Reverse the substring
        subString.reverse();

        // Build the final string
        String result = my_string.substring(0, s) + subString.toString() + my_string.substring(e + 1);
        
        return result;
    }
}
