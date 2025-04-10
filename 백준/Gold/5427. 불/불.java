import java.io.*;
import java.util.*;

public class Main{
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};

    static int w,h;
    static char [][] graph;
    static boolean [][]visited;

    static Queue<int []> fireQ;
    static Queue<int []> personQ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            graph = new char [h][w];
            visited = new boolean [h][w];

            fireQ = new LinkedList<>();
            personQ = new LinkedList<>();

            for(int j = 0; j < h; j++){
                String str = br.readLine();
                for(int k = 0; k < w; k++){
                    graph[j][k] = str.charAt(k);

                    if(graph[j][k] == '@'){
                        personQ.offer(new int [] {j,k});
                        visited[j][k] = true;
                    }

                    if(graph[j][k] == '*'){
                        fireQ.offer(new int [] {j,k});
                    }
                }
            }

            int result = bfs();

            if(result == -1) sb.append("IMPOSSIBLE\n");
            else sb.append(result+"\n");
        }

        System.out.println(sb);
    }
    static int bfs(){
        int time = 0;

        while(!personQ.isEmpty()){
            time ++;

            //불 먼저 이동
            int fireQsize = fireQ.size(); 
            for(int i = 0; i < fireQsize; i++){
                int [] cur = fireQ.poll();

                for(int d = 0; d < 4; d++){
                    int nx = cur[0] + dx[d];
                    int ny = cur[1] + dy[d];
    
                    if(nx>=0 && nx<h && ny>=0 && ny<w){
                        if(graph[nx][ny] == '.'){
                            graph[nx][ny] = '*';
                            fireQ.offer(new int [] {nx,ny});
                        }
                    }
                }
            }

            //사람 이동
            int personQsize = personQ.size();
            for(int i = 0; i < personQsize; i++){
                int [] cur = personQ.poll();

                // 탈출 성공
                if (cur[0] == 0 || cur[0] == h - 1 || cur[1] == 0 || cur[1] == w - 1) {
                    return time;
                }

                for(int d = 0; d < 4; d++){
                    int nx = cur[0] + dx[d];
                    int ny = cur[1] + dy[d];
    
                    if(nx>=0 && nx<h && ny>=0 && ny<w){
                        if(graph[nx][ny] == '.' && !visited[nx][ny]){
                            visited[nx][ny] = true;
                            personQ.offer(new int [] {nx,ny});
                        }
                    }
                }
            }

            
        }
        return -1;
    }

}
