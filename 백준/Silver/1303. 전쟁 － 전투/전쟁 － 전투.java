import java.io.*;
import java.util.*;

public class Main{

    static int N,M;
    static char [][] graph;
    static boolean [][] visited;

    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};

    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        graph = new char[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                graph[i][j] = str.charAt(j);
            }
        }

        int white = 0;
        int blue = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(graph[i][j] == 'W' && !visited[i][j]){
                    cnt = 0;
                    dfs(i,j,'W');
                    white += cnt*cnt;

                }
                else if(graph[i][j] == 'B' && !visited[i][j]){
                    cnt = 0;
                    dfs(i,j,'B');
                    blue += cnt*cnt;
                }
            }
        }

        System.out.println(white+" "+blue);
    }

    public static void dfs(int x, int y, char ch){
        cnt ++;
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx>=0 && nx<N && ny>=0 && ny<M && !visited[nx][ny] && graph[nx][ny] == ch){
                dfs(nx,ny,ch);
            }
        }

    }
}
