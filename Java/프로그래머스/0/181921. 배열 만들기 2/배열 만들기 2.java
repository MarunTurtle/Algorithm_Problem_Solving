
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
        
        for (int i = l; i <= r; i++) {
            String num = "" + i;
            boolean check = true;
            
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) != '5' && num.charAt(j) != '0') {
                    check = false;
                    break;
                }
            }
            if (check) {
                result.add(i);   
            }
        }
        
        return result.isEmpty() ? new int[] {-1} : result.stream().mapToInt(i -> i).toArray();
        
    }
}

