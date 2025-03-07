import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int count;
    static char [][] graph;
    static boolean [][] visited;
    static StringBuilder sb = new StringBuilder();

    static int [] dx = {1,-1,0,0};
    static int [] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        graph = new char[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String str = br.readLine();

            for(int j = 0; j < N; j++){
                graph[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visited[i][j]){
                    dfs(i,j);
                    count++;
                }
            }
        }

        sb.append(count+" ");

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(graph[i][j] == 'G'){
                    graph[i][j] = 'R';
                }
            }
        }

        visited = new boolean[N][N];
        count = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visited[i][j]){
                    dfs(i,j);
                    count++;
                }
            }
        }

        sb.append(count);

        System.out.println(sb);
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        char tmp_char = graph[x][y]; 
        
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny>=0 && nx<N && ny <N){
                if(!visited[nx][ny] && tmp_char == graph[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }
}