import java.util.*;

public class Solution {
    public int solution (int[] rank, boolean[] attendance) {
        
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) rankMap.put(i, rank[i]);
        }
        
        List<HashMap.Entry<Integer, Integer>> sortedRanks = new ArrayList<>(rankMap.entrySet());
        
        sortedRanks.sort(Map.Entry.comparingByValue());
        
        int a = sortedRanks.get(0).getKey();
        int b = sortedRanks.get(1).getKey();
        int c = sortedRanks.get(2).getKey();
            
        return 10000 * a + 100 * b + c;
                
    }
}