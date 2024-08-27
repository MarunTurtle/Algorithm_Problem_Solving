class Solution {
    public int[] solution(int[] num_list, int n) {
        
        // Declare size
        int length = num_list.length;
        
        // Declare answer
        int[] answer = new int[length];
        
        // First loop: Move elements from index n to the end of num_list to the start of answer
        for (int i = 0; i < length - n; i++) {
            answer[i] = num_list[n + i];
        }
        
        // Second loop: Move elements from the start of num_list to index n-1 to the end of answer
        for (int i = 0; i < n; i++) {
            answer[length - n + i] = num_list[i];
        }
        
        return answer;
    }
}