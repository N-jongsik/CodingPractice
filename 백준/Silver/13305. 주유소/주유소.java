import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       int N = Integer.parseInt(br.readLine());

       StringTokenizer st = new StringTokenizer(br.readLine());

       long [] distance = new long [N-1];

       for(int i = 0; i < N-1; i++){
        distance[i] = Integer.parseInt(st.nextToken());
       }

       st = new StringTokenizer(br.readLine());

       long [] cost = new long[N];

       for(int i = 0; i < N; i++){
        cost[i] = Integer.parseInt(st.nextToken());
       }

       long minCost = cost[0];
       long sum = 0;

       for(int i = 0; i < N-1; i++){
        if(cost[i] < minCost){
            minCost = cost[i];
        }
        sum += (long)(minCost * distance[i]);
       }

       System.out.println(sum);
    }
}
