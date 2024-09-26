import java.util.*;

public class Solution {
    public int[] solution (int[] arr, int[][] queries) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int[] query : queries) {
            
            int s = query[0];
            int e = query[1];
            
            for (int i = s; i <= e; i++) {
                result.add(arr[i]);   
            }            
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}