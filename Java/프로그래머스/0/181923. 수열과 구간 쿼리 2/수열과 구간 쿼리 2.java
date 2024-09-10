import java.util.*;
import java.util.stream.*;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int[] query : queries) {
            
            int min = Integer.MAX_VALUE;
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < min) {
                    min = arr[i];     
                }                    
            }
            
            if (min == Integer.MAX_VALUE) {
                result.add(-1);
            } else {
                result.add(min);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}