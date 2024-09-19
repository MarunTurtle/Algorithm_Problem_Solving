public class Solution {
    public int solution (int n) {
    
        int a = n % 2;
        int sum = 0;
        
        for (int i = a; i <= n; i += 2) {
            if (a == 1) {
                sum += i;
            } else {
                sum += Math.pow(i, 2);
            }
        }
        
        return sum;
    }
}