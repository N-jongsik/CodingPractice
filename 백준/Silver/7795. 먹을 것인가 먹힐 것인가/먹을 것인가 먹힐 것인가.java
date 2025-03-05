import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int [] A = new int[N];
            int [] B = new int[M];

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                A[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                B[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(A);
            Arrays.sort(B);

            int answer = 0;
            int lt = 0, rt = 0;

            while (lt < N) {
                while (rt < M && B[rt] < A[lt]) {
                    rt++; // B[rt]가 A[lt]보다 작으면 rt 증가
                }
                answer += rt; // 현재 lt에서 B 배열에서 작은 원소 개수를 더해줌
                lt++; // A 배열 포인터 이동
            }

            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
