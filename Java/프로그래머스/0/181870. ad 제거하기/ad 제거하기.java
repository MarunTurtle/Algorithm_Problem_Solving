import java.util.*;

public class Solution{
    public String[] solution (String[] strArr) {
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) result.add(strArr[i]);
        }
        
        return result.toArray(new String[0]);
    }
}