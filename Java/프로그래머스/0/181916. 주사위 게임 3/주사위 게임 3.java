import java.util.*;

class Solution {
    public int solution (int a, int b, int c, int d) {
             
        int[] num_list = new int[]{a, b, c, d};
        Arrays.sort(num_list);
        
        int first = num_list[0];
        int second = num_list[1];
        int third = num_list[2];
        int fourth = num_list[3];
        
        if (first == second) {
            if (second == third) {
                if (third == fourth) {  // 1 = 2 = 3 = 4
                    return 1111*first;                    
                } else {
                    return (int) Math.pow(10 * first + fourth, 2); // 1 = 2 = 3 | 4
                }
            } else {
                if (third == fourth) {
                    return (first + third) * Math.abs(first - third); // 1 = 2 | 3 = 4
                } else {
                    return third * fourth; // 1 = 2 | 3 | 4
                }  
            } 
        } else { 
            if (second == third) {
                if (third == fourth) {
                    return (int) Math.pow(10 * fourth + first, 2); // 1 | 2 = 3 = 4
                } else {
                    return first * fourth; // 1 | 2 = 3 | 4
                }
            } else {
                if (third == fourth) {
                    return first * second; // 1 | 2 | 3 = 4
                } else {
                    return first; // 1 | 2 | 3 | 4
                }
            }
        }
    }
}