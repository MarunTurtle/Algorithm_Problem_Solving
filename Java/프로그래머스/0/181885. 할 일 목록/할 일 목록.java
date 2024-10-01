import java.util.*;

public class Solution {

    public String[] solution(String[] todo, boolean[] finished) {
        List<String> resultList = new ArrayList<>(); 
        
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                resultList.add(todo[i]); 
            }
        }
        
        return resultList.toArray(new String[0]);
    }
}
