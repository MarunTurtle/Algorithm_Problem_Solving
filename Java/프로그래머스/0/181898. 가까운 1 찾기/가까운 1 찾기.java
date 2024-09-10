// class Solution {
//     public int solution(int[] arr, int idx) {
        
//         // Iterate through arry from idx to the end
//         for (int j = idx; j < arr.length; j++) {
//             // Check if the value of the item is 1
//             if (arr[j] == 1) {
//                 return j;
//             }            
//         }
//         // If not found, return -1
//         return -1;
//     }
// }

import java.util.*;

public class Solution {
    public int solution(int[] arr, int idx) {
        
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            } 
        }
        return -1;    
    }
}