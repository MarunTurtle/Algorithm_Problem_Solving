// import java.util.stream.IntStream;

// class Solution {
//     public int solution(int a, int d, boolean[] included) {
//         return IntStream.range(0, included.length)
//                         .map(idx -> included[idx] ? a + (idx * d) : 0)
//                         .sum();
//     }
// 


import java.util.*;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int sum = 0;
        
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                sum += a + (d * i);
            }
        }
        
        return sum;
    }
}