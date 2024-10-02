public class Solution {
    public int solution (int[] nums) {
        int len = nums.length;
        int count = 0; 
        
        for (int num : nums) {
            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = (num - 1)/2;
                }
                count++;
            }
        }
        
        return count;
    }
}