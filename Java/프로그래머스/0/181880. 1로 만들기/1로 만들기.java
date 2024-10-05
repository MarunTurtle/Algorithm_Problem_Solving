public class Solution {
    public int solution (int[] numArr) {
        int count = 0;
        
        for (int n : numArr) {
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                    count++;
                } else {
                    n = (n-1) / 2;
                    count++;
                }
            }
        }
        
        return count;
    }
}