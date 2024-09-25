import java.util.*;

public class Solution {
    public int[] solution (int[] nums, int n) {
        
        int[] result = new int[(nums.length - 1 + n)/n];
        
        for (int i = 0, j = 0; i < nums.length; i += n) {
            result[j++] = nums[i];
        }
        
        return result;
    }
}