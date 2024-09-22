class Solution {
    public String solution (String my_string, int[] index_list) {
        
        StringBuilder result = new StringBuilder();
        
        for (int idx : index_list) {
            result.append(my_string.charAt(idx));
        }
        
        return result.toString();
    }
}