import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int [][] graph;
    static int[][] tempLab;
    static int answer = Integer.MIN_VALUE;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int [N][M];
        tempLab = new int[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < M; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        wall(0);
        System.out.println(answer);
    }

    public static void wall(int count){
        if(count == 3){
            answer = Math.max(answer,bfs());
            return;
        }else{
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(graph[i][j] == 0){
                        graph[i][j] = 1;
                        wall(count+1);
                        graph[i][j] = 0;
                    }
                }
            }
        }
    }

    public static int bfs(){
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                tempLab[i][j] = graph[i][j];

                if(tempLab[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()){
            int [] cur = q.poll();

            for(int i = 0; i < 4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx >= 0 && nx < N && ny >= 0 && ny < M){
                    if(tempLab[nx][ny] == 0 ){
                        tempLab[nx][ny]=2;
                        q.offer(new int [] {nx,ny});
                    }
                }
            }
        }

        int safeArea = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tempLab[i][j] == 0) {
                    safeArea++;
                }
            }
        }
        return safeArea;

    }
}