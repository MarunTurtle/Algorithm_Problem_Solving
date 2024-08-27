class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        
        int length = my_string.length();
        
        answer.append(my_string.substring(length - n, length)); 
                      
        return answer.toString();
    }
}