class Solution {
    public String solution(String my_string, int n) {
        // Declare answer
        StringBuilder answer = new StringBuilder();
        
        // Declare length of the word
        int length = my_string.length();
        
        // Add the substring to the answer
        answer.append(my_string.substring(length - n, length)); 
        
        // Return the answer
        return answer.toString();
    }
}