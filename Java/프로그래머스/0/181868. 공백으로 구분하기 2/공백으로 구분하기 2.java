class Solution {
    public String[] solution(String my_string) {
        // 문자열을 공백을 기준으로 분리하면서, 연속된 공백을 무시합니다.
        String[] words = my_string.trim().split("\\s+");
        
        return words;
    }
}
