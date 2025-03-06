import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int [][] graph;
    static boolean [][] visited;
    static List<Integer> lst;
    static int apart;
    static int [] aparts = new int[25*25];

    static int [] dx = {1,-1,0,0};
    static int [] dy = {0,0,1,-1};


    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        graph = new int[N+1][N+1];

        for(int i = 0; i < N; i++){
            String str = br.readLine();

            for(int j = 0; j < N; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }


        visited =  new boolean [N+1][N+1];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(graph[i][j] == 1 && !visited[i][j]){
                    apart ++;
                    bfs(i,j);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(apart);

        for(int i = 0; i < aparts.length; i++){
            if(aparts[i] != 0){
                System.out.println(aparts[i]);
            }
        }

    }

    public static void bfs(int x, int y){
        Queue<int []> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        visited[x][y] = true;
        aparts[apart] ++;

        while(!q.isEmpty()){

            int [] cur = q.poll();

            for(int i = 0; i < 4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= N){
                    continue;
                }
                if(graph[nx][ny] == 0 || visited[nx][ny]){
                    continue;
                }

                q.offer(new int [] {nx,ny});
                visited[nx][ny] = true;
                aparts[apart] ++;

            }

            
        }
    }
}
