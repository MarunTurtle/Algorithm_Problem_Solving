// class Solution {
//     public int[] solution(int start_num, int end_num) {
        
//         int[] nums = new int[end_num-start_num+1];

//         for (int i = start_num; i <= end_num; i++) {
//             nums[i - start_num] = i;            
//         }

//         return nums;
//     }
// }

import java.util.*;

class Solution {
    public int[] solution(int s, int e) {
        
        ArrayList<Integer> list = new ArrayList<>();
            
        for (int i = s; i <= e; i++) {
            list.add(i);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}