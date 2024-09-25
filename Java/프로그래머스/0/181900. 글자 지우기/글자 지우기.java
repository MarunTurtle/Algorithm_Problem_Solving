// // import java.util.*;

// // public class Solution {
// //     public String solution(String my_string, int[] indices) {
// //         Set<Integer> indexSet = new HashSet<>();
        
// //         for (int idx : indices) {
// //             indexSet.add(idx);
// //         }
        
// //         StringBuilder result = new StringBuilder();
        
// //         for (int i = 0; i < my_string.length(); i++) {
// //             if (!indexSet.contains(i)) {
// //                 result.append(my_string.charAt(i));
// //             }
// //         }
        
// //         return result.toString();
// //     }
// // }

// // import java.util.*;



// // class Solution {
// //     public String solution(String my_string, int[] indices) {
// //         StringBuilder sb = new StringBuilder(my_string);
// //         for (int i : indices) {
// //             sb.setCharAt(i, ' ');
// //         }
// //         return sb.toString().replace(" ", "");
// //     }
// // }

// class Solution {
//     public String solution (String my_string, int[] indices) {
        
//         String[] result = my_string.split("");
        
//         for (int i : indices) {
//             result[i] = "";
//         }
        
//         return String.join("", result);
//     }
// }

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String my_string, int[] indices) {
        Set<Integer> indexSet = Arrays.stream(indices).boxed().collect(Collectors.toSet());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!indexSet.contains(i)) {
                result.append(my_string.charAt(i));
            }
        }
        return result.toString();
    }
}