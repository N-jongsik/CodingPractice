import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int sum = 0;

        while(pq.size() > 1){
            int num1 = pq.poll();
            int num2 = pq.poll();

            int add = num1+num2;
            sum += (add);
            pq.offer(add);
        }

        System.out.println(sum);
        
    }

}