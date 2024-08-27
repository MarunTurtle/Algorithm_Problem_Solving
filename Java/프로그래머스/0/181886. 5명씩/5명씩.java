class Solution {
    public String[] solution(String[] names) {
        
        // Calculate the correct size for the answer array
        int size = (names.length % 5 == 0) ? names.length / 5 : names.length / 5 + 1;
        
        String[] answer = new String[size];
        
        // Fill the answer array with every 5th name from the names array
        for (int i = 0; i < size; i++) {
            answer[i] = names[5 * i];
        }
        
        return answer;
    }
}
