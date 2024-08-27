class Solution {
    public int[] solution(int[] num_list, int n) {   
        
        
        int length = num_list.length;
        
        int[] answer = new int[length + 1 - n];
       
            
        System.arraycopy(num_list, n-1, answer, 0, length + 1 - n);
    
            
        return answer;
    }
}