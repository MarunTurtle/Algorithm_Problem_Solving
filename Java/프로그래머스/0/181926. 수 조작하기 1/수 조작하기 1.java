class Solution {
    public int solution(int n, String control) {

        // Chnage String to ArrayList
        // Check every character in the ArrayList
        for (char cursor : control.toCharArray()) {
            switch (cursor) {
                case 'w' -> n += 1;
                case 'a' -> n -= 10;
                case 's' -> n -= 1;
                case 'd' -> n += 10;
                default -> {
                }
            }
        }

        return n;
    }
}