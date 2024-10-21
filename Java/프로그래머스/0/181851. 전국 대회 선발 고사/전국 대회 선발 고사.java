import java.util.*;

public class Solution {
    public int solution (int[] rank, boolean[] attendance) {
        
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) rankMap.put(i, rank[i]);
        }
        
        List<Map.Entry<Integer, Integer>> sortedRank = new ArrayList<>(rankMap.entrySet());
        sortedRank.sort(Map.Entry.comparingByValue());
        
        int a = sortedRank.get(0).getKey();
        int b = sortedRank.get(1).getKey();
        int c = sortedRank.get(2).getKey();
        
        return 10000 * a + 100 * b + c;
    }
}