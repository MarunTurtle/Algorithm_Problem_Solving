

import java.util.*;

class Solution {
    static final int N = 16;
    static int [][] maze;
    static boolean [][] visited;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            sc.nextInt();
            maze = new int[N][N];
            visited = new boolean[N][N];

            for (int i = 0; i < N; i++) {
                String[] line = sc.next().split("");
                for (int j = 0; j < N; j++) {
                    maze[i][j] = Integer.parseInt(line[j]);
                }
            }
            
            boolean result = dfs(1,1);
            System.out.println("#" + tc + " " + (result ? 1 : 0));
        }
    }

    static boolean dfs(int x, int y) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        if (x < 0 || y < 0 || x >= N || y >= N || maze[x][y] == 1 || visited[x][y]) {
            return false;
        }

        if (maze[x][y] == 3) {
            return true;
        }

        visited[x][y] = true;
        boolean result;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            result = dfs(nx, ny);
            if (result) {
                return true;
            }
        } 
        return false;
    }
}