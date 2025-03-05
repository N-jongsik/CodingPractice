import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int [] lst = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        int lt = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        int length = Integer.MAX_VALUE;

        for(int rt = 0; rt < N; rt++){
            sum += lst[rt];

            while( lt <= rt && sum >= S){
                length = rt-lt+1;
                sum-=lst[lt];
                lt++;
            } 

            result = Math.min(result, length);
        }
        if(result == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(result);
    }
}
