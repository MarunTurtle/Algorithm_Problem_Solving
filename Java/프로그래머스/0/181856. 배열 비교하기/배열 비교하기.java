import java.util.*;

public class Solution {
    public int solution (int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        
        for (int j = 0; j < arr2.length; j++) {
            sum2 += arr2[j];
        }
                
        int result = compare(len1, len2);
        
        if (result == 0) {
            int result2 = compare(sum1, sum2);
            return result2;
        } else {
            return result;
        }
                
        
    }
    
    public static int compare (int a, int b) {
        if (a > b) return 1;
        else if (a < b) return -1;
        else return 0;
    }
}