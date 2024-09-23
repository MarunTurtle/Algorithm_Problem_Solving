
// import java.util.ArrayList;
// public class Solution {
//     public int[] solution (int l, int r) {
        
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for (int i = 1; i < 64; i++) {
            
//             int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            
//             if (l <= num && num <= r) list.add(num);
            
//         }
        
//         return list.isEmpty() ? new int[] {-1} : list.stream().mapToInt(i -> i).toArray();  
//     }
// }

import java.util.*;

public class Solution {
    public int[] solution (int l, int r) {
        
        ArrayList<Integer> result = new ArrayList<>();
        String numStr = "";

        for (int num = l; num <= r; num++) {
            if (num % 5 == 0) {
                
                numStr = num + "";
                boolean isOk = true;
                
                for (char c : numStr.toCharArray()) {
                    if ((c - '0') != 0 && (c - '0') != 5) {
                        isOk = false;
                        break;
                    }
                }
                if (isOk) {
                    result.add(num);
                }
            }
        }
        
        return result.isEmpty() ? new int[]{-1} : result.stream().mapToInt(i -> i).toArray();
    }
}

