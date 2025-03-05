import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int [] lst = new int[N];

        for(int i = 0; i < N; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lst);

        int lt = 0, rt = N-1, answer = 0;

        while(lt < rt){
            if(lst[lt] + lst[rt] >= M){
                answer++;
                lt++;
                rt--;
            }else{
                lt++;
            }
        }
        System.out.println(answer);
    }
}