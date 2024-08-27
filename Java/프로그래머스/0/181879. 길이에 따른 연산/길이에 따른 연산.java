class Solution {
    public int solution(int[] num_list) {
        
        int length = num_list.length;
        int result = 1;
        
        if (length >= 11) {
            for (int i = 0; i < length; i++) {
                result += num_list[i];
            }
            return result - 1;
        } else {
            for (int i = 0; i < length; i++) {
                result *= num_list[i];
            }
            return result;
        }    
    }
}