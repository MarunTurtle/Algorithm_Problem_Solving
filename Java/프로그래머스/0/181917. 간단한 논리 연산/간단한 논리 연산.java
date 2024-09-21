// class Solution {
//     public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
//         return ((x1 || x2) && (x3 || x4));
//     }
// }


// class Solution {
//     public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
//         boolean answer = false;

//         int t = 0;
//         int f = 0;

//         boolean[] isit = {x1, x2, x3, x4};

//         for(int i = 0; i < isit.length; i += 2){
//             boolean current = isit[i];
//             boolean next = isit[i + 1];


//             if(current || next){
//                 t ++;
//             }
//             else if(!current && !next){
//                 f ++;
//             }
//         }
//         //System.out.println(t + " " + f);

//         if(t > f) return true;

//         return answer;
//     }
// }


class Solution {
    public boolean solution (boolean x1, boolean x2, boolean x3, boolean x4) {
        
        return ((x1||x2) && (x3||x4));
        
    }
}