import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {      
               
        // Array to store answer       
        int length = my_string.length();
        String[] answer = new String[length];
        
        // Iterate through all of the postfixes
        for (int i = 0; i < length; i++) {
            answer[i] = my_string.substring(i);
        }
        
        // Sort the answer and return answer
        Arrays.sort(answer);
        return answer;
    }
}