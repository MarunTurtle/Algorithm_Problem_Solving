class Solution {
    public String solution(String[] str_list, String ex) {
        
        StringBuilder result = new StringBuilder();
        
        // If the element contains the ex, erase the ex
        for (String str : str_list) {
            if (!str.contains(ex)) {
                result.append(str);        
            }
        }
        
        return result.toString();
    }
}