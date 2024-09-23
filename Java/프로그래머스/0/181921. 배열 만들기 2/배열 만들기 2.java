
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
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // 5로 시작하는 최소값 l을 찾기
        int start = (l % 5 == 0) ? l : (l + (5 - l % 5));

        // 5의 배수만 검사
        for (int num = start; num <= r; num += 5) {
            if (isValid(num)) {
                result.add(num);
            }
        }
        
        return result.isEmpty() ? new int[]{-1} : result.stream().mapToInt(i -> i).toArray();
    }
    
    // 숫자가 0과 5로만 이루어졌는지 확인하는 함수
    private boolean isValid(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
