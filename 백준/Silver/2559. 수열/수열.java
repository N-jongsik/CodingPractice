import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int [] lst = new int [N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int answer = 0;

        for(int i = 0; i < K; i++){
            sum += lst[i];
            answer = sum;
        }

        for(int i = K; i < N; i++){
            sum += (lst[i] - lst[i-K]);
            answer = Math.max(answer,sum);
        }
        System.out.println(answer);
    }
}
