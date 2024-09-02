import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        // Initialize maxLength to track the maximum length of any string
        int maxLength = 0;
        for (String word : strArr) {
            // Use Math.max to update maxLength
            maxLength = Math.max(maxLength, word.length());
        }
        
        // Create countArr with size maxLength + 1
        int[] countArr = new int[maxLength + 1];
        
        // Count occurrences of each string length
        for (String word : strArr) {
            countArr[word.length()]++;
        }
        
        // Find the maximum count using Math.max
        int maxCount = 0;
        for (int count : countArr) {
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}
