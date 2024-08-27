class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        
        // Declare answer StringBuilder
        StringBuilder answer = new StringBuilder();
        
        //Iterate through my_strings and parts simultaneously
        for (int i = 0; i < my_strings.length; i++) {

            // Select the characters using parts column numbers
            String words = my_strings[i];
            int start = parts[i][0];
            int end = parts[i][1];
                      
            // Add them to the answer  
            answer.append(words.substring(start, end + 1));
        }
        
        return answer.toString();
    }
}