class Solution {
    public int[] solution(int n, int k) {
        
        // Calculate the size of the answer array
        int size = n / k;
        
        // Initialize the answer array with the correct size
        int[] answer = new int[size];
       
        // Fill the array with multiples of k
        for (int i = 1; i <= size; i++) {
            answer[i - 1] = i * k;
        }
        
        return answer;
    }
}
