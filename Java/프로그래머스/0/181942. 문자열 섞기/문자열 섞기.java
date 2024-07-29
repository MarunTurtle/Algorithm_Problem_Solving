class Solution {
    public String solution(String str1, String str2) {
        
//         //Declare StringBuilder result, str1.length(), str2.length() 
//         StringBuilder result = new StringBuilder();
//         int n = str1.length();
//         int m = str2.length();
        
        
//         //Utilize for loop to iterate each strings and append to the result 
//         for (int i = 0; i < n; i++) {
//             result.append(str1.charAt(i));
//             result.append(str2.charAt(i));       
//         }
        
//         //Print result
//         return result.toString();
//     }
        String answer = "";

        for(int i = 0; i < str1.length(); i++){
            answer+= str1.charAt(i);
            answer+= str2.charAt(i);
        }

        return answer;
    }

}