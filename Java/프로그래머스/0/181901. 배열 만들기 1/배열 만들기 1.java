// class Solution {
//     public int[] solution(int n, int k) {
        
//         // Calculate the size of the answer array
//         int size = n / k;
        
//         // Initialize the answer array with the correct size
//         int[] answer = new int[size];
       
//         // Fill the array with multiples of k
//         for (int i = 1; i <= size; i++) {
//             answer[i - 1] = i * k;
//         }
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int[] solution(int n, int k) {

        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = k; i <= n; i += k) {
            result.add(i);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}