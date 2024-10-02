public class Solution {
    
    static int sum;
    static int i;
    
    public int solution (int[] nums, int n) {
        
        sum = 0; 
        i = 0;
        
        while(sum <= n) {
            sum += nums[i];
            i++;
        }
        
        return sum;
    }
}