import java.io.*;
import java.util.*;

public class Main {
    static int node;
    static int line;
    static int [][] graph;
    static boolean [] check;
    static int count = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        graph = new int[node+1][node+1];

        for(int i = 0; i < line; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        check = new boolean[node+1];

        dfs(1);
        System.out.println(count - 1);
        
    }

    public static void dfs(int start){
        check[start] = true;
        count++;

        for(int i = 0; i <= node; i++){
            if(graph[start][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }
}
