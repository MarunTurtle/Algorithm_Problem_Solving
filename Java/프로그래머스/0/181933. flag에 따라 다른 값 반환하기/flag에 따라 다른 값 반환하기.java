// class Solution {
//     public int solution (int a, int b, boolean flag) {
        
//         if (flag) return a + b;
//         else return a - b;
        
//     }
// }


// class Solution {
//     public int solution(int a, int b, boolean flag) {
//         if (flag) {
//             return a + b; // if true return a + b
//         } else {
//             return a - b; // if false return a - b
//         }
//     }
// }


class Solution {
    public int solution (int a, int b, boolean flag) {
        
        return flag ? a + b : a - b;
            
    }
}