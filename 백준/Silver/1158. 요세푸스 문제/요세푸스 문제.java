import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < N; i++){
            q.offer(i+1);
        }

        while(!q.isEmpty()){
            for(int i = 1; i < K; i++){
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.replace(sb.length()-2,sb.length()-1,">");
        System.out.println(sb);
    }
}