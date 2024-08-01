class Solution {
    public int solution(int a, int b) {
     
        // sum1 
        int sum1 = Integer.parseInt("" + a + b);
        
        // sum2
        int sum2 = 2 * a * b; 
        
        // compare the two and return the greater one
        return (sum1 >= sum2 ? sum1 : sum2);

    }
}