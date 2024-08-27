class Solution {
    public String solution(String my_string, int[] indices) {
        // Delcare boolean[] to keep track of must-delete indices
        boolean[] toDelete = new boolean[my_string.length()];
        
        // Set the indices that need deletion
        for (int index : indices) {
            toDelete[index] = true;
        }
        
        // Declare Stringbuilder answer
        StringBuilder answer = new StringBuilder();
        
        // Iterate through my_string
        for (int i = 0; i < my_string.length(); i++) {
            // If it is NOT TRUE to delete, append the chracter to the answer
            if (!toDelete[i]) {
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }
}
