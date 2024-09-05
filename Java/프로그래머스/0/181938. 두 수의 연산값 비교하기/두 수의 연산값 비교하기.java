class Solution {
    public int solution (int a, int b) {
        
        int n = Integer.parseInt("" + a + b);
        
        int m = 2 * a * b;
        
        return Math.max(n, m);
        
    }
}