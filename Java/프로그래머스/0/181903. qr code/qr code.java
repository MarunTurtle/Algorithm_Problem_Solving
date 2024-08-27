class Solution {
    public String solution(int q, int r, String code) {
        
        // Declare answer 
        StringBuilder answer = new StringBuilder(); 
        
        // Iterate through all the index that meets the standard
        for (int i = r; i < code.length(); i= i+q) {
            answer.append(code.charAt(i));
        }
        
        return answer.toString();
    }
}