public class Solution {
    public int solution (String[] orders) {
        int sum = 0;
        String amrcno = "americano";
        String latte = "latte";
        
        
        for (String order : orders) {
            if (order.contains(latte)) {
                sum += 5000;
            } else {
                sum += 4500;
            }
        }        
        
        return sum;
    }
}