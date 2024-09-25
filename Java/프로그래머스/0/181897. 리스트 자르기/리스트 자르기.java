import java.util.*;

public class Solution {
    public int[] solution (int n, int[] slicer, int[] num_list) {
        
        int s = n == 1 ? 0 : slicer[0];
        int e = n == 2 ? num_list.length - 1 : slicer[1];
        int k = n == 4 ? slicer[2] : 1;
        
        int[] result = new int[(e - s + k)/k];
        
        for (int i = s, j = 0; i <= e; i += k) {
            result[j++] = num_list[i];
        }
        
        return result;
    }
}
