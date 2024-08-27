class Solution {
    public int solution(int[] num_list) {
        
        // Declare count
        int count = 0;
        
        // Declare length
        int length = num_list.length;
        
        // While loop until every number becomes one
        while (true) {
            // Declare boolean changed
            Boolean changed = false;
            
            for (int i = 0; i < length; i++) {
                if (num_list[i] != 1) {
                    if (num_list[i] % 2 == 0) num_list[i] /= 2; 
                    else num_list[i] = (num_list[i] - 1) / 2;
                    changed = true;
                    count++;
                }
            }
            if (!changed) break;
        }
        
        return count;
    }
}