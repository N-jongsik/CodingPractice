import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            q.offer(i+1);
        }

        while(!q.isEmpty()){
            int head = q.poll();
            sb.append(head).append(" ");

            if(q.isEmpty()){
                break;
            }
            int bottom = q.poll();
            q.offer(bottom);
        }
        System.out.println(sb);
    }
}
