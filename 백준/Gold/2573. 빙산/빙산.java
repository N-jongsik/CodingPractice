import java.io.*;
import java.util.*;

public class Main{
    static int [][] graph;
    static boolean [][] visited;
    
    static int N,M;

    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};

    static Queue<int []> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int [N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());

                if(graph[i][j] != 0){
                    q.offer(new int [] {i,j});
                }
            }
        }

        int years = 1;

        while(true){
            melt();

            int cnt = countIce();

            if(cnt >= 2){
                System.out.println(years);
                break;
            }

            if(q.isEmpty()){
                System.out.println(0);
                break;
            }

            years ++;
        }
    }

    //빙산 녹이는 함수
    static void melt(){
        int size = q.size();
            int [][] temp = new int[N][M];

            //각각 주변에서 0인거 구해서 빼주기
            for(int i = 0; i < size; i++){
                int [] cur = q.poll();

                int x = cur[0];
                int y = cur[1];

                int zeroCount = 0;

                for(int j = 0; j < 4; j++){
                    int nx = x + dx[j];
                    int ny = y + dy[j];
        
                    if(nx>=0 && nx<N && ny>=0 && ny<M && graph[nx][ny] == 0){
                        zeroCount ++;
                    }
                }
                temp[x][y] = Math.max(0,graph[x][y] - zeroCount); //주변 0인거 뺀 값 (0이면 안됨)
            }

            //빙산 높이 update코드
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    graph[i][j] = temp[i][j];
                    if(graph[i][j] != 0){
                        q.offer(new int [] {i,j});
                    }
                }
            }
    }

    static int countIce(){
        visited = new boolean [N][M];

        int count = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(!visited[i][j] && graph[i][j] != 0){
                    dfs(i,j);
                    count ++;
                }   
            }
        }

        return count;
    }

    static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && nx<N && ny>=0 && ny<M && !visited[nx][ny] && graph[nx][ny] != 0){
                dfs(nx,ny);
            }
        }
    }

}
