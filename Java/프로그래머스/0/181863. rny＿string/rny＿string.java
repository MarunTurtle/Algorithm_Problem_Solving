class Solution {
    public String solution(String rny_string) {
        
        // Declare result
        StringBuilder result = new StringBuilder();
        
        //Delcare length
        int length = rny_string.length();
        
        // Iterate through each character in rny_string
        for (int i = 0; i < length; i++) {
            
            if(rny_string.charAt(i) == 'm') {
                result.append("rn");
            } else {
                result.append(rny_string.charAt(i));
            }
        }
        
        return result.toString();
        
    }
}