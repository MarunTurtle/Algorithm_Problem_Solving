// class Solution {
//     public int solution(String number) {
        
//         int sum = 0;
//         int length = number.length();

//         for (int i = 0; i < length; i++) {
//             sum += number.charAt(i) - '0';
//         }

//         int mod = sum % 9;
//         return mod;
//     } 
// }

// class Solution {
//     public int solution(String number) {
//         int sum = 0;

//         for (String numStr : number.split("")) {
//             int digit = Integer.parseInt(numStr);
//             sum += digit;
//         }

//         int result = sum % 9;
//         return result;
//     }
// }

class Solution {
    public int solution (String number) {
        
        int sum = 0;
        
        for (int i = 0; i < number.length(); i++) {
            int n = Integer.valueOf(number.charAt(i) + "");    
            sum += n;
        }
        
        return sum % 9;
    }
}

