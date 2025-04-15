import java.io.*;
import java.util.*;

public class Main{
    static int N,M;

    static int [] pm;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        pm = new int[N];

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int level){
        if(level == M){
            for(int i = 0; i < M; i++){
                sb.append(pm[i] + " ");
            }
            sb.append("\n");
        }else{
            for(int i = 1; i <= N; i++){
                pm[level] = i;
                dfs(level+1);
            }

        }

    }
}
