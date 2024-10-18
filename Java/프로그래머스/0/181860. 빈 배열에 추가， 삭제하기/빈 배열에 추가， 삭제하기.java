import java.util.*;

public class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        int len = flag.length;
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < len; i++) {
            if (flag[i]) {
                int j = 0;
                while (j < arr[i] * 2) {
                    result.add(arr[i]);
                    j++;
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    result.remove(result.size() - 1);
                }
            }
        }
     
        return result.stream().mapToInt(i -> i).toArray();
    }
}