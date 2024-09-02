class Solution {
    public int solution(String my_string, String target) {
        int answer = my_string.contains(target) ? 1 : 0;
        return answer;
    }
}

// class Solution {
//     public int solution(String my_string, String target) {
//         // Length of the substring
//         int sublen = target.length();
        
//         // Iterate through my_string
//         for (int i = 0; i <= my_string.length() - sublen; i++) {
//             String substring = my_string.substring(i, i + sublen);
//             if (substring.equals(target)) {
//                 return 1;
//             }
//         }
//         return 0;  
//     }
// }
