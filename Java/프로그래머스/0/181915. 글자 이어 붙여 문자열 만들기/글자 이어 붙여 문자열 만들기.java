class Solution {
    public String solution(String my_string, int[] index_list) {
        
        // Declare StringBuilder result
        StringBuilder result = new StringBuilder();
        
        // for every char in the my_string append it to the result
        for (int i : index_list) {
            result.append(my_string.charAt(i));
        }
        
        // Change StringBuilder type to String
        String answer = result.toString();
        
        // Return the answer
        return answer;
    }
}