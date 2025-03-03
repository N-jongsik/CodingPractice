import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int [] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        Arrays.sort(A);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(st.nextToken());
            
            int result = Arrays.binarySearch(A,num);

            if(result < 0) sb.append(0).append("\n");
            else sb.append(1).append("\n");
        }

        System.out.println(sb);
    }
}
