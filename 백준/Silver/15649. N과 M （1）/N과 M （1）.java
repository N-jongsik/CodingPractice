import java.io.*;
import java.util.*;

public class Main{
    static int count;
    static int N;
    static int M;
    static int [] pm;
    static boolean [] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        pm = new int[M];
        visited = new boolean[N+1];

        dfs(0);
    }
    public static void dfs(int level){
        if(level == M){
            for(int item : pm){
                System.out.print(item + " ");
            }
            System.out.println();
        }else{
            for(int i = 1; i <= N; i++){
                if(!visited[i]){
                    visited[i] = true;
                    pm[level] = i;
                    dfs(level+1);
                    visited[i] = false;
                }
                
            }

        }
    }
}