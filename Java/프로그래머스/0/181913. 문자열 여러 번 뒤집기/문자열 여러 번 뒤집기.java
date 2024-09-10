class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int[] query : queries) {
            
            int s = query[0];
            int e = query[1];
            
            String segment = sb.substring(s, e+1);
            
            String rev_seg = new StringBuilder(segment).reverse().toString();
            
            sb.replace(s, e+1, rev_seg);
        }
               
        return sb.toString();
    }
}