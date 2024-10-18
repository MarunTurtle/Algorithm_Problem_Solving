public class Solution {
    public int solution (String numStr) {
        
        String[] strArr = numStr.split("");
        
        int sum = 0;
        
        for (String str : strArr) {
            sum += Integer.parseInt(str);
        }
        
        return sum;
    }
}