class Solution {
    public int[] solution(int[] num_list) {
        
        int last_idx = num_list.length;
        int last = num_list[last_idx-1];
        int secondLast = num_list[last_idx-2];

        int newNum;
        if (last > secondLast) {
            newNum = last - secondLast;
        } else {
            newNum = last * 2;
        }

        int[] newArr = new int[last_idx + 1];
        System.arraycopy(num_list, 0, newArr, 0, num_list.length);
        newArr[last_idx] = newNum;

        return newArr;
    }
}