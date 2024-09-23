import java.util.*;

public class Solution {
    public int[] solution(int[] num_list, int n) {
    
        int[] result = new int[n];
        
        System.arraycopy(num_list, 0, result, 0, n);
        
        return result;
    }
}