import java.util.*;

public class Solution {
    public int[] solution (int[] arr, int[][] intervals) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int[] interval : intervals) {
            int s = interval[0];
            int e = interval[1];
            for (int i = s; i <= e; i++) {
                result.add(arr[i]);
            }
        }        
        
        return result.stream().mapToInt(i -> i).toArray(); 
    }
}