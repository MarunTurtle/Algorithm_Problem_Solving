import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, length);
        
    }
}