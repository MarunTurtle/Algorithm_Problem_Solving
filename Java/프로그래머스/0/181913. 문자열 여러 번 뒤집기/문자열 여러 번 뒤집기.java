class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        // Read every query and flip the selected segment of my_string
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            
            // Extract the substring to be flipped
            String segment = sb.substring(start, end + 1);
            
            // Reverse the extracted substring
            String reversedSegment = new StringBuilder(segment).reverse().toString();
            
            // Replace the original segment with the reversed segment
            sb.replace(start, end + 1, reversedSegment);
        }
        
        return sb.toString();
    }
}
