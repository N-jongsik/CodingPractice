import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] A = new int[N];
        int [] B = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> answer = new ArrayList<>();
        int lt = 0, rt = 0;
        while(lt < N && rt < M){
            if(A[lt] < B[rt]){
                answer.add(A[lt]);
                lt++;
            }else{
                answer.add(B[rt]);
                rt ++;
            }
        }
        while(lt < N){
            answer.add(A[lt]);
            lt++;
        }
        while(rt < M){
            answer.add(B[rt]);
            rt++;
        }

        StringBuilder sb = new StringBuilder();
        for(int item : answer){
            sb.append(item).append(" ");
        }
        System.out.println(sb);
    }
}
