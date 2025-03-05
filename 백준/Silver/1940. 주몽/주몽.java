import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] lst = new int[N];
        for(int i = 0; i < N; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lst);

        int lt = 0, rt = N-1;
        int answer = 0;

        while(lt < rt){
            if(lst[lt] + lst[rt] == M){
                answer++;
                lt++;
                rt--;
            }else if(lst[lt] + lst[rt] < M) lt++;
            else rt--;
        }
        System.out.println(answer);

    }
}
