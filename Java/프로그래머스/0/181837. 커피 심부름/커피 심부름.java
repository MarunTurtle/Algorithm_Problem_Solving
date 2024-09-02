class Solution {
    public int solution(String[] orders) {
        
        int result = 0;
        
        for (String order : orders) {
            if (order.contains("americano")) {
                result += 4500;
            } else if (order.contains("cafelatte")) {
                result += 5000;
            } else if (order.contains("anything")) {
                result += 4500;
            }
        }   
        
        return result;
    }
}