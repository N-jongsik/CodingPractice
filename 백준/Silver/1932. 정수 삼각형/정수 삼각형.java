import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [][] lst = new int[n+1][n+1];
        int [][] dp = new int[n+1][n+1];

        for(int i = 1;  i <= n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <=i; j++){
                lst[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1;  i <= n; i++){
            for(int j = 1; j <=i; j++){
                dp[i][j] = lst[i][j] + Math.max(dp[i-1][j-1],dp[i-1][j]);
            }
        }

        int max = -1;

        for(int i = 1; i<=n; i++){
            if(dp[n][i] > max){
                max = dp[n][i];
            }
        }
        System.out.println(max);

    }
}