class Solution {
    public String solution(String myString) {
        
        int len = myString.length();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < len; i++) {
            if (myString.charAt(i) < 'l') {
                sb.append('l');
            } else {
                sb.append(myString.charAt(i));
            }
        }
        
        return sb.toString();        
    }
}