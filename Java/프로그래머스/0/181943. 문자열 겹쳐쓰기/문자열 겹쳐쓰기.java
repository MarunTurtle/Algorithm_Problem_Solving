// public class Solution {
//     public String solution (String my_string, String overwrite_string, int s) {
        
//         StringBuilder sb = new StringBuilder(my_string);
        
//         int len = overwrite_string.length();
        
//         sb.replace(s, s+len, overwrite_string);
        
//         return sb.toString();
//     }
// }


// public class Solution {
//     public String solution (String my_string, String overwrite_string, int s) {
//         StringBuilder sb = new StringBuilder(my_string);
        
//         sb.replace(s, s+overwrite_string.length(), overwrite_string);
        
//         return sb.toString();
        
        
//     }
// }

public class Solution {
    public String solution (String my_string, String overwrite_string, int s) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        sb.replace(s, s+overwrite_string.length(), overwrite_string);
        
        return sb.toString();
    }
}