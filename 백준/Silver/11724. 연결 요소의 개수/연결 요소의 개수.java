import java.io.*;
import java.util.*;

public class Main{
    static boolean [] visited;
    static List<List<Integer>> lst;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];

        lst = new ArrayList<>();
        for(int i = 0; i <= N; i++){
            lst.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            lst.get(u).add(v);
            lst.get(v).add(u);
        }

        int answer = 0;
        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                bfs(i);
                answer ++;
            }
        }
        System.out.println(answer);
    }
    public static void bfs(int num){
        Queue<Integer> q = new LinkedList<>();
        q.offer(num);
        visited[num] = true;

        while(!q.isEmpty()){
            int cur = q.poll();

            for(int item : lst.get(cur)){
                if(!visited[item]){
                    q.offer(item);
                    visited[item] = true;
                }
            }
        }
    }
}
