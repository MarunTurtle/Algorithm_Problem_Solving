import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int[] delete) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : delete) {
            deleteSet.add(num);
        }
        
        List<Integer> resultList = new ArrayList<>();
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                resultList.add(num);
            }
        }
              
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
