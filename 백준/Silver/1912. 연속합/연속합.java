import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] lst = new int[N+1];
        int [] dp = new int [N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=N; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i<=N; i++){
            dp[i] = lst[i];
        }

        for(int i = 1; i<=N; i++){
            if(i ==1){
                dp[i] = lst[i];
            }
            dp[i] = Math.max(dp[i],dp[i-1]+lst[i]);
        }

        int max = Integer.MIN_VALUE;
        for(int i = 1; i<=N; i++){
            if(dp[i] > max){
                max = dp[i];
            }
        }

        System.out.println(max);
    }
}