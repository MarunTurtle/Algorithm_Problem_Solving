class Solution {
    public String solution(String myString, String pat) {
        
        // Find the last occurrence of the pattern
        int index = myString.lastIndexOf(pat);
        
        // If the pattern is found, return the substring that ends at the end of the pattern
        if (index != -1) {
            return myString.substring(0, index + pat.length());
        }
        
        // If the pattern is not found, return the original string
        return myString;
    }
}
