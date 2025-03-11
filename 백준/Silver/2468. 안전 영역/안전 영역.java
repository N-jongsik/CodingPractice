import java.io.*;
import java.util.*;

public class Main {
    static int N, maxHeight;
    static int[][] graph;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];

        maxHeight = 0; // 높이의 최댓값

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, graph[i][j]); // 최대 높이 갱신
            }
        }

        int maxSafeAreas = 0;

        // 강수량을 0부터 최대 높이까지 변화시키면서 안전 영역 계산
        for (int rain = 0; rain <= maxHeight; rain++) {
            visited = new boolean[N][N]; // 방문 배열 초기화
            int count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // 현재 위치가 침수되지 않았고, 방문하지 않은 경우 DFS 탐색
                    if (graph[i][j] > rain && !visited[i][j]) {
                        dfs(i, j, rain);
                        count++;
                    }
                }
            }

            maxSafeAreas = Math.max(maxSafeAreas, count); // 최대값 갱신
        }

        System.out.println(maxSafeAreas);
    }

    public static void dfs(int x, int y, int rain) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if (!visited[nx][ny] && graph[nx][ny] > rain) {
                    dfs(nx, ny, rain);
                }
            }
        }
    }
}
