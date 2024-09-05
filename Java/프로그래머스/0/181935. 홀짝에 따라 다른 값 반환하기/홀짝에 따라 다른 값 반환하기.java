class Solution {
    public int solution (int n) {
        
        int isEven = (n % 2 == 0) ? 1 : 0;
        int result = 0;
        
        for (int i = isEven + 1; i <= n; i+=2) {
            result += (isEven == 1) ? i * i : i;
        }     
        return result;
    }
}