// import java.util.Arrays;

// class Solution {
//     public int[] solution(int[] arr, int k) {
        
//         // Declare result array with size k, initialize all elements to -1
//         int[] result = new int[k];
//         Arrays.fill(result, -1);  // Fill the array with -1 initially
        
//         // Declare idx
//         int idx = 0;
        
//         // Iterate through integers in arr
//         for (int i = 0; i < arr.length; i++) {
//             // Stop if the last element in the result array is not -1
//             if (idx >= k) {
//                 break;
//             }
//             // Check if arr[i] is already in result array
//             boolean alreadyExists = false;
//             for (int j = 0; j < idx; j++) {
//                 if (result[j] == arr[i]) {
//                     alreadyExists = true;
//                     break;
//                 }
//             }
//             // If arr[i] is not already in the result array, add it
//             if (!alreadyExists) {
//                 result[idx++] = arr[i];    
//             }
//         }
        
//         // If idx < k, the remaining elements in result are already set to -1, no need to fill them again
        
//         return result;
//     }
// }


import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        // Declare result as an ArrayList to use contains method
        ArrayList<Integer> resultList = new ArrayList<>();
        
        // Iterate through integers in arr
        for (int i = 0; i < arr.length; i++) {
            if (resultList.size() >= k) {
                break;
            }
            // If resultList does not contain arr[i], add it to the list
            if (!resultList.contains(arr[i])) {
                resultList.add(arr[i]);
            }
        }
        
        // Convert resultList to an array of size k
        int[] result = new int[k];
        
        // Copy elements from resultList to result array
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        // Fill remaining elements with -1 if resultList has less than k elements
        for (int i = resultList.size(); i < k; i++) {
            result[i] = -1;
        }
        
        return result;
    }
}
