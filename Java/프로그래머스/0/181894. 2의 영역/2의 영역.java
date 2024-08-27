class Solution {
    public int[] solution(int[] arr) {
        
        int startIdx = Integer.MAX_VALUE; 
        int endIdx = Integer.MIN_VALUE;
        int size = arr.length;
        
        for (int i = 0; i < size; i++) {
            if (arr[i] == 2) {
                if (startIdx > i) {
                    startIdx = i;
                }
                endIdx = i;
            }
        }
        
        if (endIdx == Integer.MIN_VALUE) endIdx = startIdx;
        if (startIdx == Integer.MAX_VALUE) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
            
        int[] answer = new int[endIdx - startIdx + 1];
        for (int j = startIdx; j <= endIdx; j++) {
            answer[j - startIdx] = arr[j];
        }
        return answer;
    }
}
