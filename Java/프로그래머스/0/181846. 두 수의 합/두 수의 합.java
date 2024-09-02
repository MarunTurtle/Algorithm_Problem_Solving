import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        try {
            BigInteger ia = new BigInteger(a);
            BigInteger ib = new BigInteger(b);
            return ia.add(ib).toString();
        } catch (NumberFormatException e) {
            return "Invalid input";
        }
    }
}
