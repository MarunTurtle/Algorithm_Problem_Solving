public class Solution {
    public int solution (int n) {
        
        int result = 0;
        
        if (n % 2 == 0) {
            for (int i = 0; i <= n; i+=2) {
                result += (int) Math.pow(i, 2);
            }
        } else {
            for (int i = 1; i <= n; i+=2) {
                result += i;
            }
        }
        
        return result;
    }
}