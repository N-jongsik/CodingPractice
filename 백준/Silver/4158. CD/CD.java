import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if (N == 0 && M == 0) break; // 종료 조건

            int[] A = new int[N];
            int[] B = new int[M];

            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(br.readLine());
            }

            int lt = 0, rt = 0, answer = 0;

            while (lt < N && rt < M) {
                if (A[lt] == B[rt]) {
                    answer++;
                    lt++;
                    rt++;
                } else if (A[lt] < B[rt]) {
                    lt++;
                } else {
                    rt++;
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.print(sb);
    }
}
