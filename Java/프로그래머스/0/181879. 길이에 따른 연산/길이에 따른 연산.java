class Solution {
    public int solution(int[] num_list) {
        
        int length = num_list.length;
        int result = (length >= 11) ? 0 : 1;

        for (int i = 0; i < length; i++) {
            if (length >= 11) {
                result += num_list[i];
            } else {
            result *= num_list[i];
            }
        }
        return result;
    }
}