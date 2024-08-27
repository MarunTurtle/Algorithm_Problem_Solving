class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int length = my_string.length();

        // Extract characters where i % m == c - 1 (since c is 1-based index)
        for (int i = 0; i < length; i++) {
            if (i % m == c - 1) {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }
}
