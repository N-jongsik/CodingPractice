import java.io.*;
import java.util.*;

public class Main {
    static int M;
    static int N;
    static int [][] graph;
    static boolean visited [][] ;
    static int [][] day;
    static int count = 0;
    static int result = Integer.MIN_VALUE;

    static int [] dx = {1,-1,0,0};
    static int [] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        graph = new int[N][M];
        day = new int[N][M];

        Queue<int []> q = new LinkedList<>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());

                if(graph[i][j] == 1){
                    q.offer(new int[]{i,j});
                }
            }
        }

        int k = 0;

        for(int [] row : graph){
            for(int item : row){
                if(item == 0) k++;
            }
        }

        if(k == 0) System.out.println(0);
        else{
            int answer = bfs(q);
            System.out.println(answer);
        }

    }
    public static int bfs(Queue<int []> q){
        while(!q.isEmpty()){
            int [] cur = q.poll();

            for(int i = 0; i < 4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
    
                if(nx>=0 && nx < N && ny>=0 && ny < M  && graph[nx][ny] == 0){
                    q.offer(new int[] {nx,ny});
                    graph[nx][ny] = 1; // 익은 토마토로 변경
                    day[nx][ny] = day[cur[0]][cur[1]] + 1;
                    result = Math.max(day[nx][ny], result);
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(graph[i][j] == 0){
                    return -1;
                }
            }
        }

        return result;
    }
}