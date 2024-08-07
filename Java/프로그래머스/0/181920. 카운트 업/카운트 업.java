class Solution {
    public int[] solution(int start_num, int end_num) {
        
        int[] nums = new int[end_num-start_num+1];

        for (int i = start_num; i <= end_num; i++) {
            nums[i - start_num] = i;            
        }

        return nums;
    }
}