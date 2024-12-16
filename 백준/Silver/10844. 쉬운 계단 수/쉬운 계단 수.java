import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int k = 1000000000;

        int[][] dp = new int[N + 1][10];

        //행 -> 자릿 수 / 열 -> 시작 수 dp[자릿 수 ][시작하는 수]

        for (int i = 0; i <= 9; i++) {
            dp[1][i] = 1; //한 자릿 수 애들은 자기 자신이 하나이므로 갯수 1로 저장
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][1] % k;
                } else if (j == 9) {
                    dp[i][j] = dp[i - 1][8] % k;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] % (k) + dp[i - 1][j + 1] % (k))%k;
                }
            }
        }

        int sum = 0;
        for(int i = 1; i<=9; i++){
            sum += dp[N][i];
            sum%=k;
        }
        System.out.println(sum);
    }
}