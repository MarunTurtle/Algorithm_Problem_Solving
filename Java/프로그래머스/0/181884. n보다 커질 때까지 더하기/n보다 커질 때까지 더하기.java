class Solution {
    public int solution (int[] nums, int n) {
        
        int sum = 0;
        
        for (int num : nums) {
            if (sum <= n) {
                sum += num;
            }
        }
        
        return sum;
    }
}