class Solution {
    public int solution(int a, int b) {
        
        // Best Solution
        int answer = 0;
        
        // Use String concatenation ""
        int aLong = Integer.parseInt("" + a + b);
        int bLong = Integer.parseInt("" + b + a);
        
        // Ternary Operator
        answer = aLong > bLong ? aLong : bLong;

        return answer;
        
        // My initial solution
//         // Declare variable to store the result
//         int res;
//         
//         // Declare two String variables by type casting
//         String aString = Integer.toString(a);
//         String bString = Integer.toString(b);
//         
//         // First addition
//         String sum1 = aString + bString;
//         
//         // Second addition
//         String sum2 = bString + aString;
//         
//         // Re-declare two int variables by type casting
//         int intsum1 = Integer.valueOf(sum1);
//         int intsum2 = Integer.valueOf(sum2);   
//         
//         
//         // Compare the two ints
//         if (intsum1 > intsum2) {
//             res = intsum1;
//         } else {
//             res = intsum2;
//         }
//         
//         // Return the greater number
//         return res;
        
    }
}