import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 자연수 N 입력
        int sum = 0;

        // 각 자릿수를 더하기
        while (N > 0) {
            sum += N % 10; // N의 마지막 자릿수를 sum에 더함
            N /= 10; // N을 10으로 나눠 다음 자릿수로 이동
        }

        // 결과 출력
        System.out.println(sum);

        sc.close();
    }
}
