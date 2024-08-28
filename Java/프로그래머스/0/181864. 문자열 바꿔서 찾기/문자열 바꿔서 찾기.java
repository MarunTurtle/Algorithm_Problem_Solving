class Solution {
    public int solution(String myString, String pat) {
        
        StringBuilder newString = new StringBuilder();
        
        int length = myString.length();
        
        for (int i = 0; i < length; i++) {
            if (myString.charAt(i) == 'B') newString.append('A');
            else if (myString.charAt(i) == 'A') newString.append('B');
        } 
        
        if (newString.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}