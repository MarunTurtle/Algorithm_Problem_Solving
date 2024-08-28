class Solution {
    public String solution(String my_string, String alp) {
        
        // StringBuilder for fluent update
        StringBuilder result = new StringBuilder();
        
        // Declare Length
        int length = my_string.length();
        
        // Iterate through my_string
        for (int i = 0; i < length; i++) {
            Character curChar = my_string.charAt(i);
            
            if (curChar.equals(alp.charAt(0))) {
                result.append(Character.toUpperCase(curChar));               
            } else {
                result.append(curChar);
            }
        }     
        
        return result.toString();
    }
}