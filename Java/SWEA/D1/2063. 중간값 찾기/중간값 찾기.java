import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 점수의 개수 N
        int[] scores = new int[N]; // 점수들을 저장할 배열

        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }

        // 점수들을 오름차순으로 정렬
        Arrays.sort(scores);

        // 중간값 출력
        int midIndex = N / 2;
        System.out.println(scores[midIndex]);

        sc.close();
    }
}
