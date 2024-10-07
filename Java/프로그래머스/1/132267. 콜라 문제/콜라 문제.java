class Solution {
    public int solution(int a, int b, int n) {
        return calculateTotalCola(a, b, n, 0);
    }

    private int calculateTotalCola(int a, int b, int n, int total) {
        if (n < a) {
            return total;
        }
        int exchanged = (n / a) * b;
        int remain = n % a;
        return calculateTotalCola(a, b, exchanged + remain, total + exchanged);
    }
}