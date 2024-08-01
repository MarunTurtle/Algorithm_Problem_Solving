class Solution {
    public int solution(int n) {
        // Better solution
        int ans = 0;

        for(int i = n; i >= 0; i -= 2)
            ans += (n % 2 == 0) ? i * i : i;

        return ans;
        
        // My initial solution
//         //declare result
//         int result = 0;
        
//         // switch operator
//         switch (n % 2) {
//             // odd case
//             case 1 :
//                 for (int i = 1; i <= n; i += 2) { result += i; }         
//                 break;
                
//             // even case     
//             case 0 :
//                 for (int i = 0; i <= n; i += 2) { result += i*i; }                        
//                 break;
//         }
//         return result;
    }
}