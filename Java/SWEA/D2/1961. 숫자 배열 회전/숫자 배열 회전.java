import java.util.Scanner;

public class Solution {

    // 90도 회전
    public static int[][] rotate90(int[][] matrix, int N) {
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[j][N - 1 - i] = matrix[i][j];
            }
        }
        return result;
    }

    // 180도 회전
    public static int[][] rotate180(int[][] matrix, int N) {
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[N - 1 - i][N - 1 - j] = matrix[i][j];
            }
        }
        return result;
    }

    // 270도 회전
    public static int[][] rotate270(int[][] matrix, int N) {
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[N - 1 - j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 수

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[][] matrix = new int[N][N];

            // 행렬 입력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // 회전된 행렬 계산
            int[][] matrix90 = rotate90(matrix, N);
            int[][] matrix180 = rotate180(matrix, N);
            int[][] matrix270 = rotate270(matrix, N);

            // 결과 출력
            System.out.println("#" + t);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(matrix90[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < N; j++) {
                    System.out.print(matrix180[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < N; j++) {
                    System.out.print(matrix270[i][j]);
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
