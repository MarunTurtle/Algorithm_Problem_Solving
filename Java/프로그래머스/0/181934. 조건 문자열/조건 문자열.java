class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        // Switch operator
        switch (ineq) {
            case "<":
                return eq.equals("!") ? (n < m ? 1 : 0) : (n <= m ? 1 : 0);
            case ">":
                return eq.equals("!") ? (n > m ? 1 : 0) : (n >= m ? 1 : 0);
            default:
                // Handle invalid ineq input
                throw new IllegalArgumentException();
        }
    }
}
