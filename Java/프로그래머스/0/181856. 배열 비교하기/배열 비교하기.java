import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        // Compare lengths of the arrays
        int lengthComparison = Integer.compare(arr1.length, arr2.length);
        
        if (lengthComparison != 0) {
            return lengthComparison;
        } else {
            // Lengths are equal, so compare the sums of the arrays
            int sum1 = 0;
            int sum2 = 0;
            for (int num : arr1) {
                sum1 += num;
            }
            for (int num : arr2) {
                sum2 += num;
            }
            return Integer.compare(sum1, sum2);
        }
    }
}
