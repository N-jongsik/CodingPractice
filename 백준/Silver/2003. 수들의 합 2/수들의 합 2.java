
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken());
        int [] lst = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        int lt = 0;
        int sum = 0;
        int answer = 0;

        for(int rt = 0; rt < N; rt++){
            sum += lst[rt];
            if(sum == M) answer ++;

            while(sum >= M){
                sum -= lst[lt++];
                if(sum == M) answer ++;
            }
        }
        
        System.out.println(answer);
    }
}
