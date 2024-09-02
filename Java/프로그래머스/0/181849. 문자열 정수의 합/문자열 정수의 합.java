class Solution {
    public int solution(String num_str) {
        // 문자열을 한 자리씩 분리하여 배열로 만듦
        String[] strArr = num_str.split("");
        int sum = 0;
        
        // 배열의 각 원소를 정수로 변환하여 합계 계산
        for (String s : strArr) {
            sum += Integer.parseInt(s);
        }
        
        return sum;
    }
}

// class Solution {
//     public int solution(String num_str) {
//         int sum = 0;
        
//         // 문자열의 각 문자를 숫자로 변환하여 더하기
//         for (int i = 0; i < num_str.length(); i++) {
//             sum += Character.getNumericValue(num_str.charAt(i));
//         }
        
//         return sum;
//     }
// }
