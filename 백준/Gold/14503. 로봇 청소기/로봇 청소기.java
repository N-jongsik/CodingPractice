import java.io.*;
import java.util.*;

public class Main{
    static int N;
    static int M;
    static int r,c,d;

    static int [][] graph;
    static boolean [][] visited;

    static int [] dx = {-1,0,1,0}; //북동남서서
    static int [] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        graph = new int [N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = clean();
        System.out.println(result);
        
    }

    public static int clean(){
        int answer = 0;

        while(true){
            if(!visited[r][c]){
                visited[r][c] = true;
                answer += 1;
            }

            boolean cleanOrWallAround = true;

            for(int i = 0; i < 4; i++){
                int nd = (d + 3) % 4;
                int nx = r + dx[nd];
                int ny = c + dy[nd];

                if(nx>=0 && nx<N && ny>=0 && ny<M && graph[nx][ny] == 0 && !visited[nx][ny]){
                    r = nx;
                    c = ny;
                    d = nd;
                    cleanOrWallAround = false;
                    break;
                }

                d = nd;

            }

            if(cleanOrWallAround){
                int back = (d+2) % 4;
                int bx = r + dx[back];
                int by = c + dy[back];

                if(bx>=0 && bx<N && by>=0 && by<M && graph[bx][by] == 0){
                    r = bx;
                    c = by;
                }else{
                    break;
                }
            }
        }
        return answer;
    }
}