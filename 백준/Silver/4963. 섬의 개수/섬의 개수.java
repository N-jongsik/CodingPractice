import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int j;
    static int count = 0;

    static int [] dx = {1,-1,0,0,1,-1,-1,1};
    static int [] dy = {0,0,1,-1,1,1,-1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            int [][] graph = new int[h][w];
            
            if(w == 0 && h == 0) break;

            boolean [][] visited = new boolean [h][w];

            count = 0;

            for(int i = 0; i < h; i++){
                st = new StringTokenizer(br.readLine());
                
                for(j = 0; j < w; j++){
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if(!visited[i][j] && graph[i][j] == 1){
                        dfs(i,j,visited,w,h,graph);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    public static void dfs(int x, int y, boolean [][] visited, int w, int h, int [][] graph){
        visited[x][y] = true;

        for(int i = 0; i < 8; i++){

            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx >= 0 && nx < h && ny >= 0 && ny < w){
                if(!visited[nx][ny] && graph[nx][ny] == 1){
                    dfs(nx,ny,visited,w,h,graph);
                }
            }
        }
    }
}