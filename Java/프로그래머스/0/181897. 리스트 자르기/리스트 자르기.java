import java.util.*;

public class Solution {
    public int[] solution (int n, int[] slicer, int[] num_list) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int s = (n == 1) ? 0 : slicer[0];
        int e = (n == 2) ? num_list.length-1 : slicer[1];
        int k = (n == 4) ? slicer[2] : 1;
        
        int idx = s;
        
        while (idx <= e) {
            result.add(num_list[idx]);
            idx += k;
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}