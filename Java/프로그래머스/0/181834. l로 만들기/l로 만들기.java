class Solution {
    public String solution (String myStr) {
        
        StringBuilder sb = new StringBuilder();
        int len = myStr.length();
        
        for (int i = 0; i < len; i++) {
            if (myStr.charAt(i) < 'l') {
                sb.append('l');
            } else {
                sb.append(myStr.charAt(i));
            }
        }
        
        return sb.toString();
    }
}