import java.util.*;

public class Solution {
    public int solution(int[] numList, int n) {
        // Sort the array to prepare for binary search
        Arrays.sort(numList);
        
        int left = 0;
        int right = numList.length - 1;

        // Binary search
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (numList[mid] == n) {
                return 1;  // Target found
            } else if (numList[mid] < n) {
                left = mid + 1;  // Search the right half
            } else {
                right = mid - 1;  // Search the left half
            }
        }
        
        return 0;  // Target not found
    }
}
