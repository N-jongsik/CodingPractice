import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int [] check;
    static StringBuilder sb;

    public static void dfs(int v){
        check[v] = 1;
        sb.append(v + " ");

        for(int nv : graph.get(v)){
                if(check[nv] == 0){
                    check[nv] = 1;
                    dfs(nv);
                }
            }
        
    }

    public static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        check[v] = 1;

        while(!q.isEmpty()){
            int cur = q.poll();
            sb.append(cur + " ");

            for(int nv : graph.get(cur)){
                if(check[nv] == 0){
                    q.offer(nv);
                    check[nv] = 1;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<Integer>());
        }

        check = new int[N+1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        for(int i = 1; i <= N; i++){
            Collections.sort(graph.get(i));
        }

        dfs(V);
        sb.append("\n");

        check = new int[N+1];
        bfs(V);

        System.out.println(sb);
    }
}