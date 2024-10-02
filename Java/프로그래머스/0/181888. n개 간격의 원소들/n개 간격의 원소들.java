import java.util.*;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int len = num_list.length;
        int size = (len - 1 + n) / n;
        int[] result = new int[size];
        
        for (int i = 0, j = 0; i < len; i += n) {
            result[j++] = num_list[i];
        }
        
        return result;
    }
}