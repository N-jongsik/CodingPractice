import java.util.*;
import java.io.*;

public class Main {
    static int l;
    static int start_x, start_y, end_x, end_y;

    static int [] dx = {-2,-1,1,2,-2,-1,1,2};
    static int [] dy = {1,2,2,1,-1,-2,-2,-1};

    static int [][] visited;
    static int [][] map;

    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int [] {start_x, start_y});
        visited[start_x][start_y] = 1;

        while (!q.isEmpty()){
            int [] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for(int i = 0; i < dx.length; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < l && ny < l){
                    if(visited[nx][ny] == 0){
                        q.add(new int[] {nx, ny});
                        map[nx][ny] = map[x][y] + 1;
                        visited[nx][ny] = 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            l = Integer.parseInt(br.readLine());

            visited = new int[l][l];
            map = new int[l][l];

            StringTokenizer st = new StringTokenizer(br.readLine());

            start_x = Integer.parseInt(st.nextToken());
            start_y = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            end_x = Integer.parseInt(st.nextToken());
            end_y = Integer.parseInt(st.nextToken());

            bfs();

            sb.append(map[end_x][end_y]).append("\n");
        }

        System.out.println(sb);
    }

}