import java.util.*;

class Solution {
    static final int N = 16;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            sc.nextInt(); // 테스트케이스 번호 생략
            maze = new int[N][N]; visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                String line = sc.next();
                for (int j = 0; j < N; j++) maze[i][j] = line.charAt(j) - '0';
            }
            System.out.println("#" + tc + " " + (dfs(1, 1) ? 1 : 0));
        }
    }

    static boolean dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= N || maze[x][y] == 1 || visited[x][y]) return false;
        if (maze[x][y] == 3) return true;
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) if (dfs(x + dx[i], y + dy[i])) return true;
        return false;
    }
}
