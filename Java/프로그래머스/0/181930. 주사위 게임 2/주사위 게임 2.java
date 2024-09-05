class Solution {
    public double solution(int a, int b, int c) {
        double answer = 1;
        int i;

        // If all a, b, and c are different, i = 0
        if (a != b && b != c && a != c) {
            i = 1;
        } 
        // If all a, b, and c are the same, i = 3
        else if (a == b && b == c) {
            i = 3;
        } 
        // If there is a pair among a, b, and c, i = 2
        else {
            i = 2;
        }

        for (int j = 1; j <= i; j++) {
            answer *= (Math.pow(a, j) + Math.pow(b, j) + Math.pow(c, j));
        }
        return answer;
    }
}


// public class Solution {
//     public int solution(int a, int b, int c) {
//         if (a != b && b != c && c != a) {
//             return a + b + c;
//         } 
//         else if (a == b && b == c) {
//             return (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
//         } 
//         else {
//             return (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
//         }
//     }
// }
