import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int INF = 1000000;

        int [][] space = new int [N][M];
        int [][][] dp = new int [N][M][3];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                space[i][j] = Integer.parseInt(st.nextToken());
                Arrays.fill(dp[i][j],INF);
            }
        }   

        for(int j = 0; j < M; j++){
            for(int d = 0; d < 3; d++){
                dp[0][j][d] = space[0][j];
            }
        }

        for(int i = 1; i < N; i++){
            for(int j = 0; j < M; j++){
                for(int d = 0; d < 3; d++){
                    int prevJ = j + (d-1); // 0:왼쪽, 1:아래, 2:오른쪽

                    if(prevJ < 0 || prevJ >= M) continue;

                    for(int prevD = 0; prevD < 3; prevD++){
                        if(d == prevD) continue;

                        dp[i][j][d] = Math.min(dp[i][j][d], dp[i-1][prevJ][prevD] + space[i][j]);
                    }
                }
            }
        }

        int answer = INF;

        for(int j = 0; j < M; j++){
            for(int d = 0; d < 3; d++){
                answer = Math.min(answer, dp[N-1][j][d]);
            }
        }

        System.out.println(answer);
    }
}
