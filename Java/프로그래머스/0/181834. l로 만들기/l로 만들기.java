class Solution {
    public String solution(String myString) {
        
        StringBuilder nString = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) < 'l') {
                nString.append("l");
            } else {
                nString.append(myString.charAt(i));
            }
        }
        return nString.toString();
    }
}