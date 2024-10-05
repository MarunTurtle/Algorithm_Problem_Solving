import java.util.*;

public class Solution {
    public double solution (int a, int b) {
        if (a % 2 == 0 && b % 2 == 0) {
            return Math.abs(a - b);
        } else if (a % 2 == 0 || b % 2 == 0) {
            return 2 * (a + b);
        } else {
            return Math.pow(a, 2) + Math.pow(b, 2);
        }   
    }
}