class Solution {
    public String solution(int q, int r, String code) {
        
        // Declare answer 
        String answer = ""; 
        
        // Iterate through all the index that meets the standard
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                // add the Character to the answer
                answer += code.charAt(i);
            }
        }
        
        return answer;
    }
}