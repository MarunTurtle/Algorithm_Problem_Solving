import java.util.*;

public class Solution {
    
    static int N; // 치즈 한 변의 길이
    static int[][] cheese; // 치즈의 맛있는 정도
    static boolean[][] visited; // 방문 여부 체크
    static int[] dx = {0, 0, 1, -1}; // 상, 하, 좌, 우 탐색
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수 입력

        for (int tc = 1; tc <= T; tc++) {
            N = sc.nextInt();
            cheese = new int[N][N];
            
            // 치즈 맛있는 정도 입력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    cheese[i][j] = sc.nextInt();
                }
            }

            int maxChunks = 1; // 최대 덩어리 수 (최소 1개는 존재)

            // 1부터 100일까지 요정이 먹는 날짜 시뮬레이션
            for (int day = 1; day <= 100; day++) {
                visited = new boolean[N][N];
                int chunks = 0; // 해당 날짜에 남은 덩어리 수

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        // 해당 칸이 아직 방문하지 않았고, 요정이 먹지 않은 칸일 때 DFS/BFS로 덩어리 탐색
                        if (cheese[i][j] > day && !visited[i][j]) {
                            chunks++;
                            dfs(i, j, day); // 덩어리 찾기
                        }
                    }
                }
                maxChunks = Math.max(maxChunks, chunks); // 최대 덩어리 갱신
            }

            // 출력 형식 맞추기
            System.out.println("#" + tc + " " + maxChunks);
        }
        sc.close();
    }

    // DFS로 덩어리 탐색
    static void dfs(int x, int y, int day) {
        visited[x][y] = true; // 현재 위치 방문 처리

        // 상, 하, 좌, 우로 이동하며 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 유효한 좌표인지 확인하고, 아직 방문하지 않았으며, 요정이 먹지 않은 치즈일 경우
            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && cheese[nx][ny] > day) {
                dfs(nx, ny, day); // 재귀적으로 덩어리 탐색
            }
        }
    }
}
