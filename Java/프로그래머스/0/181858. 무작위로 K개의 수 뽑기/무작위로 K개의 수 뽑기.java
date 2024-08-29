import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        // Declare result array with size k, initialize all elements to -1
        int[] result = new int[k];
        Arrays.fill(result, -1);  // Fill the array with -1 initially
        
        // Declare idx
        int idx = 0;
        
        // Iterate through integers in arr
        for (int i = 0; i < arr.length; i++) {
            // Stop if the last element in the result array is not -1
            if (idx >= k) {
                break;
            }
            // Check if arr[i] is already in result array
            boolean alreadyExists = false;
            for (int j = 0; j < idx; j++) {
                if (result[j] == arr[i]) {
                    alreadyExists = true;
                    break;
                }
            }
            // If arr[i] is not already in the result array, add it
            if (!alreadyExists) {
                result[idx++] = arr[i];    
            }
        }
        
        // If idx < k, the remaining elements in result are already set to -1, no need to fill them again
        
        return result;
    }
}
