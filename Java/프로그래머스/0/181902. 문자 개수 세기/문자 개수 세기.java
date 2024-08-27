class Solution {
    public int[] solution(String my_string) {
        
        // Initialize the array for all the alphabets
        int[] answer = new int[52];
        
        // Read the given string
        for (char ch : my_string.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                // Uppercase letters
                answer[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                //Lowercase letters
                answer[ch - 'a' + 26]++;
            }
        }
        
        return answer;
    }
}