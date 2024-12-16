import java.io.*;
import java.util.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int [] dp = new int[12];

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());

            dp[0] = 0;
            dp[1] = 1; //1
            dp[2] = 2; //1+1, 2
            dp[3] = 4; // 1+1+1, 1+2, 2+1, 3

            for(int j = 4; j <= n; j++){
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            System.out.println(dp[n]);
        }
    }
}