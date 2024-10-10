import java.util.*;

public class Solution {
    public int solution (int[] numList, int n) {
        
        Arrays.sort(numList);
        
        int len = numList.length;
        int s = 0;
        int e = len-1;
        int mid; 
        
        while (s <= e) {
            mid = (s + e) / 2;
            if (numList[mid] == n) {
                return 1;
            } else if (numList[mid] > n) {
                e = mid-1;
            } else {
                s = mid+1;
            }   
        }
        return 0;
    }
}