public class Solution {
    public int solution (int[] nums) {
        int len = nums.length;
        int sum;
        
        if (len > 10) {
            sum = 0; 
            for (int num : nums) {
                sum += num;
            }
            return sum;
        } else {
            sum = 1;
            for (int num : nums) {
                sum *= num;
            }
            return sum;
        }
    }
}