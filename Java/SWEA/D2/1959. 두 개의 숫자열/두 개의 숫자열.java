import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 수 입력

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] A = new int[N];
            int[] B = new int[M];

            // Ai 배열 입력
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            // Bj 배열 입력
            for (int j = 0; j < M; j++) {
                B[j] = sc.nextInt();
            }

            // Ai가 항상 길이가 더 짧거나 같도록 처리
            if (N > M) {
                int[] tempArr = A;
                A = B;
                B = tempArr;

                int temp = N;
                N = M;
                M = temp;
            }

            int maxSum = Integer.MIN_VALUE;

            // A를 B에 맞춰서 움직이면서 최댓값 계산
            for (int i = 0; i <= M - N; i++) {
                int currentSum = 0;
                for (int j = 0; j < N; j++) {
                    currentSum += A[j] * B[i + j];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }

            // 결과 출력
            System.out.println("#" + t + " " + maxSum);
        }

        sc.close();
    }
}
