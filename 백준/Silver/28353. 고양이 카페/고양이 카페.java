import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int [] lst = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lst);

        int lt = 0, rt = N-1, answer = 0;

        while(lt < rt){
            if(lst[lt] + lst[rt] <= K){
                answer ++;
                lt++;
                rt--;
            }else rt --;
        }
        System.out.println(answer);
    }
}
