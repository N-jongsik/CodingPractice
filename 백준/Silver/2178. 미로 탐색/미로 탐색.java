import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int [][] graph;
    static boolean [][] visited;
    static int [] dx = {0,0,1,-1};
    static int [] dy = {1,-1,0,0};

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N+1][M+1];

        for(int i = 0; i < N; i++){

            String str = br.readLine();

            for(int j = 0; j < M; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
            
        }
        
        visited = new boolean[N][M];
        bfs(0,0);

        System.out.println(graph[N-1][M-1]);
        
    }

    public static void bfs(int x, int y){
        Queue<int []> q = new LinkedList<>();
        q.offer(new int[] {x,y});

        while(!q.isEmpty()){
            int [] cur = q.poll();

            for(int i = 0; i < dx.length; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M){
                    continue;
                }
                if(visited[nx][ny] || graph[nx][ny] == 0){
                    continue;
                }
                q.offer(new int []{nx,ny});
                visited[nx][ny] = true;
                graph[nx][ny] = graph[cur[0]][cur[1]] + 1;
            }
        }

    }
}
