class Solution {
    public int solution(int[] num_list) {
        // Declare count
        int count = 0;
        
        // Declare length
        int length = num_list.length;
        
        // While loop until every number becomes one
        while (true) {
            boolean changed = false;  // Reset changed to false at the start of each iteration
            
            for (int i = 0; i < length; i++) {
                if (num_list[i] != 1) {  // If the number is not 1
                    if (num_list[i] % 2 == 0) {
                        num_list[i] /= 2;  // If even, divide by 2
                    } else {
                        num_list[i] = (num_list[i] - 1) / 2;  // If odd, subtract 1 and then divide by 2
                    }
                    changed = true;  // A change occurred
                    count++;  // Increment count for each operation performed
                }
            }
            
            if (!changed) break;  // Exit the loop if no changes occurred
        }
        
        return count;  // Return the total count of operations
    }
}
