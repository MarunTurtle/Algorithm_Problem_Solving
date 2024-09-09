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

class Solution {
    public int[] solution (int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (n != 1) {
            
            list.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        
        list.add(1);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}













// import java.util.LinkedList; // Import LinkedList to use it as a Queue
// import java.util.Queue; // Import Queue interface

// class Solution {
//     public int[] solution(int n) {
//         // Initialize a Queue to store the Collatz sequence
//         Queue<Integer> answer = new LinkedList<>();
        
//         // Loop to generate the Collatz sequence
//         while (n > 1) {
//             // Add the current value of n to the queue
//             answer.add(n);
//             // If n is even, divide it by 2 using the bitwise right shift operator
//             if (n % 2 == 0) {
//                 n >>= 1;
//             // If n is odd, apply the 3n + 1 rule
//             } else {
//                 n = n * 3 + 1;
//             }
//         }
        
//         // Add the final value 1 to the queue (since all Collatz sequences end at 1)
//         answer.add(1);
        
//         // Convert the Queue to an int[] array and return it
//         return answer.stream().mapToInt(i -> i).toArray();
//     }
// }










