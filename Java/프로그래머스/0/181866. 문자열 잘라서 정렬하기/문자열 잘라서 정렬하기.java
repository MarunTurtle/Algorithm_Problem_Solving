import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String myString) {
        // "x"를 기준으로 문자열을 나눔
        String[] parts = myString.split("x");
        
        // 빈 문자열을 제외하고, 나머지를 리스트로 필터링한 후 정렬
        List<String> filteredAndSorted = Arrays.stream(parts)
                                               .filter(s -> !s.isEmpty())  // 빈 문자열 제거
                                               .sorted()                   // 사전순으로 정렬
                                               .collect(Collectors.toList());
        
        // 리스트를 배열로 변환하여 반환
        return filteredAndSorted.toArray(new String[0]);
    }
}
