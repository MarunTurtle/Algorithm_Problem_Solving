import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // Using a list to dynamically store the result
        List<Integer> resultList = new ArrayList<>();
        
        // Iterate with step of n and add to the list
        for (int i = 0; i < num_list.length; i += n) {
            resultList.add(num_list[i]);
        }
        
        // Convert the list back to an array
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}


import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // Calculate the length of the resulting array
        int length = (num_list.length + n - 1) / n;

        // Create the result array with the calculated length
        int[] result = new int[length];
        
        // Fill the result array by picking every n-th element
        for (int i = 0, j = 0; i < num_list.length; i += n, j++) {
            result[j] = num_list[i];
        }
        
        return result;
    }
}
