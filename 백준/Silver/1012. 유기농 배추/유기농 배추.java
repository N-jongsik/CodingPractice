import java.io.*;
import java.util.*;

public class Main {
    static int row;
    static int col;
    static int K;

    static int [][] graph;
    static boolean [][] visited;

    static int [] dx = {1,-1,0,0};
    static int [] dy = {0,0,1,-1};

    static int answer;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){

            StringTokenizer st = new StringTokenizer(br.readLine());

            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            
            graph = new int[row][col];
            visited = new boolean [row][col];
            answer = 0;

            for(int i = 0; i < K; i++){
                st = new StringTokenizer(br.readLine());
    
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
    
                graph[a][b] = 1;
            }

            for(int j = 0; j < row; j++){
                for(int k = 0; k < col; k++){
                    if(graph[j][k] == 1 && !visited[j][k]){
                        dfs(j,k);
                        answer ++;
                    }
                }
            }

            sb.append(answer).append("\n");

        }
        System.out.println(sb);
    }

    public static void bfs(int x, int y){
        Queue<int []> q = new LinkedList<>();
        q.offer(new int[] {x,y});
        visited[x][y] = true;

        while(!q.isEmpty()){
            int [] cur = q.poll();

            for(int i = 0; i < 4; i++){
                
                
                int nx = dx[i] + cur[0];
                int ny = dy[i] + cur[1];
    
                if(nx >= 0 && nx < row && ny >= 0 && ny < col){
                    if(graph[nx][ny] == 1 && !visited[nx][ny]){
                        q.offer(new int [] {nx,ny});
                        visited[nx][ny] = true;
                        
                    }
                }
            }

        }
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx >= 0 && nx < row && ny >= 0 && ny < col){
                if(graph[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }
}