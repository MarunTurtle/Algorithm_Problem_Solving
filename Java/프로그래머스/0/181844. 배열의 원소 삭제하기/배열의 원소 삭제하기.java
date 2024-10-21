import java.util.*;

public class Solution {
    public int[] solution (int[] arr, int[] delete) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int i = 0; i < delete.length; i++) {
            deleteSet.add(delete[i]);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!deleteSet.contains(arr[i])) result.add(arr[i]);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}