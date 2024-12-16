import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] lst = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        // lst 배열에 입력받은 수들 저장
        for (int i = 0; i < N; i++) {
            lst[i] = Integer.parseInt(st1.nextToken());
        }

        int[] dp = new int[N + 1]; // dp는 누적합을 저장하는 배열

        // 누적합 계산
        for (int i = 1; i <= N; i++) {
            dp[i] = dp[i - 1] + lst[i - 1];  // 1부터 N까지 누적합 계산
        }

        // M개의 쿼리 처리
        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            // 구간 합을 출력
            System.out.println(dp[b] - dp[a - 1]);
        }
    }
}