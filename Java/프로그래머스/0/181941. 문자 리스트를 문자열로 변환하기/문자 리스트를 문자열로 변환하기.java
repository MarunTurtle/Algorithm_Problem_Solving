class Solution {
    public String solution(String[] arr) {
        
        // Best Solution
        return String.join("", arr);

        // Better Solution
//         for(String a : arr) {
//             answer += a;
//         }
        
        
        // My Initial Solution
//         StringBuilder sb = new StringBuilder();
//         
//         for (int i = 0; i < arr.length; i++) {
//             sb.append(arr[i]);
//         }
//         
//         return sb.toString();
    }
}