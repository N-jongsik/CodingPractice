import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        BigInteger [][] dp = new BigInteger [N+1][N+1];


        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j <= i; j++){
                if(j == i || j == 0){
                    dp[i][j] = BigInteger.ONE;
                }else{
                    dp[i][j] = (dp[i-1][j-1].add(dp[i-1][j]));
                }
            }
        }
        
        BigInteger answer = dp[N][K];
        System.out.println(answer);        
    }
}
