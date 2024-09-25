public class Solution {
    public int solution (int[] nums) {
        
        int oddSum = 0;
        int evenSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) oddSum += nums[i];
            if (i % 2 == 1) evenSum += nums[i];
        }
        
        return Math.max(oddSum, evenSum);
    }
}