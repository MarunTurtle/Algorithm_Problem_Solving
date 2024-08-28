class Solution {
    public int solution(String myString, String pat) {
        
        int count = 0;
        
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            String subString = myString.substring(i, i + pat.length());
            if (subString.equals(pat)) count++;    
        }
        
        return count;
    }
}