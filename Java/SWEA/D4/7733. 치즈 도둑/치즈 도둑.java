import java.util.Scanner;
import java.util.ArrayDeque;

class Solution {
    static int N;
    static int[][] cheese;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            cheese = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    cheese[i][j] = sc.nextInt();
                }
            }

            int maxChunks = 1; // 초기 최대 덩어리 개수는 1

            for (int day = 1; day <= 100; day++) {
                visited = new boolean[N][N];
                int chunkCount = 0;

                // 요정이 갉아먹은 치즈 상태로 갱신
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (cheese[i][j] <= day) {
                            cheese[i][j] = 0;
                        }
                    }
                }

                // 덩어리 세기
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (cheese[i][j] > 0 && !visited[i][j]) {
                            bfs(i, j);
                            chunkCount++;
                        }
                    }
                }

                maxChunks = Math.max(maxChunks, chunkCount);
            }

            // 결과 출력
            System.out.println("#" + test_case + " " + maxChunks);
        }
        
        sc.close();
    }
    
    static void bfs(int x, int y) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && cheese[nx][ny] > 0) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
