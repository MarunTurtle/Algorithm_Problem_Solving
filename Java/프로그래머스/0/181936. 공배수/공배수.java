class Solution {
    public int solution(int number, int n, int m) {
        
        // Use ternary operator
        return (number % n == 0 && number % m == 0 ? 1 : 0);
        
    }
}