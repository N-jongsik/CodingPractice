import java.io.*;
import java.util.*;

public class Main{
    static int N,M;

    static int [] pm;
    static boolean [] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        pm = new int[N];

        dfs(0,1);

    }

    public static void dfs(int level,int start){
        if(level == M){
            for(int i = 0; i < M; i++){
                System.out.print(pm[i] + " ");
            }
            System.out.println();
        }else{
            for(int i = start; i <= N; i++){
                pm[level] = i;
                dfs(level+1,i+1);
            }

        }

    }
}
