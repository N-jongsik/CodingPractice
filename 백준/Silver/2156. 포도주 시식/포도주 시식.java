import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[] lst = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            lst[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = lst[1];
        if (N >= 2) {
            dp[2] = lst[1] + lst[2];
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(lst[i - 1] + dp[i - 3], dp[i - 2]) + lst[i]);
        }

        System.out.println(dp[N]);
    }
}
