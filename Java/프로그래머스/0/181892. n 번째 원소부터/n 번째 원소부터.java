public class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] result = new int[num_list.length - n + 1];
        
        System.arraycopy(num_list, n-1, result, 0, num_list.length - n + 1);
        
        return result;
    }
}