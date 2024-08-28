class Solution {
    public int solution(String binomial) {
        // "a op b" 형태의 이항식을 공백으로 분리
        String[] biArr = binomial.trim().split(" ");
        
        // 첫 번째와 세 번째 요소를 정수로 변환
        int a = Integer.parseInt(biArr[0]);
        int b = Integer.parseInt(biArr[2]);
        
        // 연산자에 따라 계산 수행
        switch (biArr[1]) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            default -> {
                throw new IllegalArgumentException("Invalid operator: " + biArr[1]);
            }
        }
    }
}
