import java.io.*;
import java.util.*;

public class Main {
    static int K;
    static int level = 0;
    static int [] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if(N == K)System.out.println(0);
        else System.out.println(bfs(N));

    }

    public static int bfs(int N){
        Queue<Integer> q = new LinkedList<>();
        q.offer(N);
        visited[N] = 1;

        while(!q.isEmpty()){
            int cur = q.poll();
            

            for(int i = 0; i < 3; i++){
                int next;
                if(i == 0){
                    next = cur -1;
                }else if(i == 1){
                    next = cur +1;
                }else{
                    next = cur*2;
                }
                if(next == K) return (visited[cur]);

                if(next >= 0 && next < 100001 && visited[next] == 0){
                    q.offer(next);
                    visited[next] = visited[cur] + 1;   
                }
            }

            
        }


        return 0;
    }

}