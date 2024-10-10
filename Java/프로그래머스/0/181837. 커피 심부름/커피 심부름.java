public class Solution {
    public int solution (String[] orders) {
        int len = orders.length;
        int sum = 0;
        
        for (int i = 0; i < len; i++) {
            if (orders[i].contains("latte")) sum += 5000;
            else sum += 4500;
        }
        
        return sum;
    }
}