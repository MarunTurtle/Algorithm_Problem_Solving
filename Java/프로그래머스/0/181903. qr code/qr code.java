class Solution {
    public String solution(int q, int r, String code) {
        
        // Declare answer 
        String answer = ""; 
        
        // Iterate through all the index that meets the standard
        for (int i = r; i < code.length(); i= i+q) {
            answer += code.charAt(i);
        }
        
        return answer;
    }
}