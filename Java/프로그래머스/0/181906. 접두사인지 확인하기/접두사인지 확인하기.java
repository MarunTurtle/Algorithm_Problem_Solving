// class Solution {
//     public int solution(String my_string, String is_prefix) {
                
//         return my_string.startsWith(is_prefix) ? 1 : 0;
//     }
// }

class Solution {
    public int solution (String my_string, String is_prefix) {
        
        int len = my_string.length();
        
        for (int i = 0; i < len; i++) {
            if (is_prefix.equals(my_string.substring(0, i))) {
                return 1;
            }
        }
        return 0;
    }
}