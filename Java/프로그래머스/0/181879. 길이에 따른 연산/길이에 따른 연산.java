public class Solution {
    public int solution (int[] numArr) {
        int len = numArr.length;
        
        if (len >= 11) {
            int sum = 0;
            for (int n : numArr) {
                sum += n;
            }
            return sum;
        } else {
            int prod = 1;
            for (int n : numArr) {
                prod *= n;
            }
            return prod;
        }
    }
}