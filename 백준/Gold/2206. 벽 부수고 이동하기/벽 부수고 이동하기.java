import java.io.*;
import java.util.*;

public class Main {
    static int [][] graph;
    static int N;
    static int M;
    static boolean [][][]visited;

    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};

    public static class Node{
        int x;
        int y;
        int wallBroken;
        int distance;

        Node(int x, int y, int wallBroken, int distance){
            this.x = x;
            this.y = y;
            this.wallBroken = wallBroken;
            this.distance = distance;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int [N][M];
        visited = new boolean [N][M][2];

        for(int i = 0; i < N; i++){
            String str = br.readLine();

            for(int j = 0; j < M; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        int answer = bfs(0,0);
        System.out.println(answer);

    }
    public static int bfs(int x, int y){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y,0,1));
        visited[x][y][0] = true;

        while(!q.isEmpty()){
            Node cur = q.poll();

            if(cur.x == N-1 && cur.y == M-1){
                return cur.distance;
            }

            for(int i = 0; i < 4; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if(nx>=0 && nx<N && ny>=0 && ny<M){
                    if(graph[nx][ny] == 0 && !visited[nx][ny][cur.wallBroken]){
                        visited[nx][ny][cur.wallBroken] = true;
                        q.offer(new Node(nx,ny,cur.wallBroken,cur.distance+1));
                    }else if(graph[nx][ny] == 1 && cur.wallBroken == 0 && !visited[nx][ny][1]){
                        visited[nx][ny][1] = true;
                        q.offer(new Node(nx,ny,1,cur.distance+1));
                    }
                }
            }
        }

        return -1;
    }
}