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
