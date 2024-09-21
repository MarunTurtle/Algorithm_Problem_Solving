// import java.util.ArrayList;

// class Solution {
//     public int[] solution(int n) {
//         ArrayList<Integer> collatz = new ArrayList<>();
//         runCollatz(n, collatz);
//         return collatz.stream().mapToInt(i -> i).toArray();
//     }

//     private void runCollatz(int n, ArrayList<Integer> collatz) {
//         while (n != 1) {
//             collatz.add(n);
//             if (n % 2 == 0) {
//                 n /= 2;
//             } else {
//                 n = 3 * n + 1;
//             }
//         }
//         collatz.add(1); // add the final 1 to the sequence
//     }
// }

import java.util.*;

public class Solution {
    public int[] solution (int n) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while (n != 1) {
            if (n % 2 == 0) {
                result.add(n);
                n /= 2;
            } else {
                result.add(n);
                n = 3 * n + 1;
            }
        }
        
        result.add(1);
        return result.stream().mapToInt(i -> i).toArray();
        
    }
}
