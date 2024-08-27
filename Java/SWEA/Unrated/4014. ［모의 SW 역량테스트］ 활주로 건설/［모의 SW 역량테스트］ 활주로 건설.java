import java.util.Scanner;

class Solution {
    static int N, X;
    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 수
        for (int t = 1; t <= T; t++) {
            N = sc.nextInt();
            X = sc.nextInt();
            map = new int[N][N];

            // 지형 정보 입력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int result = 0;
            for (int i = 0; i < N; i++) {
                if (canBuildRunway(map[i])) result++; // 가로 방향
                if (canBuildRunway(getColumn(i))) result++; // 세로 방향
            }

            System.out.println("#" + t + " " + result);
        }

        sc.close();
    }

    // 특정 행이나 열에서 활주로를 건설할 수 있는지 확인하는 함수
    private static boolean canBuildRunway(int[] line) {
        int[] slope = new int[N]; // 경사로 설치 여부 체크

        for (int i = 0; i < N - 1; i++) {
            if (line[i] == line[i + 1]) continue; // 같은 높이인 경우 계속 진행

            // 높이 차이가 1 이상이면 활주로 건설 불가
            if (Math.abs(line[i] - line[i + 1]) > 1) return false;

            // 내리막 경사로 설치가 필요한 경우
            if (line[i] > line[i + 1]) {
                for (int j = 0; j < X; j++) {
                    if (i + 1 + j >= N || line[i + 1] != line[i + 1 + j] || slope[i + 1 + j] == 1)
                        return false;
                    slope[i + 1 + j] = 1;
                }
            }

            // 오르막 경사로 설치가 필요한 경우
            else {
                for (int j = 0; j < X; j++) {
                    if (i - j < 0 || line[i] != line[i - j] || slope[i - j] == 1)
                        return false;
                    slope[i - j] = 1;
                }
            }
        }
        return true;
    }

    // 열 데이터를 추출하는 함수
    private static int[] getColumn(int col) {
        int[] column = new int[N];
        for (int i = 0; i < N; i++) {
            column[i] = map[i][col];
        }
        return column;
    }
}
