class Solution {
    public int solution(int[] arr) {
        int count = 0;
        
        while (true) {
            boolean changed = false;  // Track if any change occurs in the current iteration
            
            for (int i = 0; i < arr.length; i++) {
                // Check if the element needs to be modified
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;  // If even and >= 50, divide by 2
                    changed = true;  // A change occurred
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;  // If odd and < 50, multiply by 2 and add 1
                    changed = true;  // A change occurred
                }
            }
            
            // If no changes occurred during this iteration, break the loop
            if (!changed) {
                break;
            }
            
            count++;  // Increment the count for each iteration where changes occurred
        }
        
        return count;  // Return the number of iterations
    }
}
