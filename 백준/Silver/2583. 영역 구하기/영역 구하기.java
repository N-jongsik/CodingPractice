import java.io.*;
import java.util.*;

public class Main{
    static int M,N,K;
    
    static int [][] graph;
    static boolean [][] visited;

    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        graph = new int [M+1][N+1];
        visited = new boolean [M+1][N+1];

        for(int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());

            int LX = Integer.parseInt(st.nextToken());
            int LY = Integer.parseInt(st.nextToken());
            int RX = Integer.parseInt(st.nextToken());
            int RY = Integer.parseInt(st.nextToken());

            for(int x = LY; x < RY; x++){
                for(int y = LX; y < RX; y++){
                    graph[x][y] = 1;
                }
            }

        }

        List<Integer> lst = new ArrayList<>();

        int count = 0;

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(graph[i][j] == 0 && !visited[i][j]){
                    int result = bfs(i,j);
                    lst.add(result);
                    count ++;
                }
            }
        }
        
        Collections.sort(lst);

        StringBuilder sb = new StringBuilder();

        for(int item : lst){
            sb.append(item + " ");
        }

        System.out.println(count);
        System.out.println(sb);
    }
    static int bfs(int x, int y){
        int answer = 1;
        Queue<int []> q = new LinkedList<>();
        visited[x][y] = true;
        q.offer(new int [] {x,y});

        while(!q.isEmpty()){
            int [] cur = q.poll();

            for(int i = 0; i < 4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx>=0 && nx<M && ny>=0 && ny<N && graph[nx][ny] == 0 && !visited[nx][ny]){
                    q.offer(new int [] {nx,ny});
                    visited[nx][ny] = true;
                    answer ++;
                }
            }
        }
        return answer;
    }
}
