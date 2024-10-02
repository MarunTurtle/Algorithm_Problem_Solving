// import java.util.*;

// public class Solution {
//     public int[] solution (int[] num_list, int n) {
        
//         int[] result = new int[num_list.length];
        
//         System.arraycopy(num_list, n, result, 0, num_list.length - n); 
//         System.arraycopy(num_list, 0, result, num_list.length - n, n);
//         return result;
//     }
// }

import java.util.*;

public class Solution {
    public int[] solution(int[] nums, int n) {
        
        int[] result = new int[nums.length];
        
        System.arraycopy(nums, n, result, 0, nums.length-n);
        System.arraycopy(nums, 0, result, nums.length-n, n);
        
        return result;
        
    }
}