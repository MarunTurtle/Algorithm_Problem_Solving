class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        // for loop --> included
        for (int i = 0; i < included.length; i++) {
            // add to answer if true
            answer += included[i] ? a + (d * i) : 0;
        }   
        return answer;
    }
}


// import java.util.stream.IntStream;

// class Solution {
//     public int solution(int a, int d, boolean[] included) {
//         return IntStream.range(0, included.length)
                        // .map(idx -> included[idx] ? a + (idx * d) : 0)
                        // .sum();
//     }
// }