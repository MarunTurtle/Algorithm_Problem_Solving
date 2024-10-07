public class Solution {
    public int solution(int[] nums) {
        int oddSum = 0;
        int evenSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                oddSum += nums[i];
            } else {
                evenSum += nums[i];
            }
        }
        
        return evenSum >= oddSum ? evenSum : oddSum;
    }
}