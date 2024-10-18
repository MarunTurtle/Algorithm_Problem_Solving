public class Solution {
    public int solution(String binomial) {
        String[] parsed = binomial.split(" ");
        int a = Integer.parseInt(parsed[0]);
        int b = Integer.parseInt(parsed[2]);
        
        if (parsed[1].equals("+")) {
            return a + b;
        } else if (parsed[1].equals("-")) {
            return a - b;
        } else {
            return a * b;
        }
    }
}