class Solution {
    public int solution(String my_string, String is_suffix) {
        // Initial value for answer is false
        int answer = 0;
        
        // Iterate through the substrings and compare with is_suffix
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.substring(i).equals(is_suffix)) {
                answer = 1; 
                break;
            }
        }

        return answer; 
    }
}