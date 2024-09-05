class Solution {
    public String solution (String code) {
        
        // Declare StringBuilder 
        StringBuilder ret = new StringBuilder();
        
        // Declare Mode
        int mode = 0;
        
        // Declare idx
        int idx = 0; 
        
        // Change String code into CharArray
        char[] codearr = code.toCharArray();
        
        // Iterate through all the letters
        for (int i = 0; i < codearr.length; i++) {
            // If you meet 1 change the mode
            if (codearr[i] == '1') {
                mode = 1 - mode;
                idx++;
                continue;
            }
            // if mode is 0
            if (mode == 0) {
                if (idx % 2 == mode) {
                    ret.append(codearr[i]);
                }
            } else { // if mode is 1
                if (idx % 2 == mode) {
                    ret.append(codearr[i]);
                }
            }
            idx++;
        }
        
        if (ret.toString().equals("")) {
            return "EMPTY";
        } else {
            return ret.toString();
        }
    }
}




















// class Solution {
//     public String solution(String code) {
//         StringBuilder answer = new StringBuilder();
//         int mode = 0;
//         for (int i = 0; i < code.length(); i++) {
//             char current = code.charAt(i);
//             if (current == '1') {
//                 mode = mode == 0 ? 1 : 0;
//                 continue;
//             }

//             if (i % 2 == mode) {
//                 answer.append(current);
//             }
//         }
//         return answer.length() == 0 ? "EMPTY" : answer.toString();
//     }
// }

// class Solution {
//     public String solution(String code) {
//         // Declare variables
//         int mode = 0;
//         StringBuilder ret = new StringBuilder();

//         // Read String code 
//         for (int idx = 0; idx < code.length(); idx++) {
//             if (code.charAt(idx) == '1') {    
//                 // if mode == 0, 
//                 if (mode == 0) {
//                     mode = 1;
//                 } else if (mode == 1) {
//                     mode = 0;
//                 }
//             } else {
//                 if (mode == 0) {
//                     // if idx % 2 == 0
//                     if (idx % 2 == 0) {
//                         // ret.add(code[idx])
//                         ret.append(code.charAt(idx));
//                     }
//                 } else if (mode == 1) {
//                     // if idx % 2 != 0 
//                     if (idx % 2 != 0) {
//                         // ret.add(code[idx])
//                         ret.append(code.charAt(idx));
//                     }
//                 }
//             }
//         }                       
//         // if ret is empty
//         if (ret.length() == 0) {
//             // return EMPTY
//             return "EMPTY";
//         } else {
//             // else return ret
//             return ret.toString();
//         }   
//     }
// }
