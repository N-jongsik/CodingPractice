import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       int N = Integer.parseInt(br.readLine());

       StringTokenizer st = new StringTokenizer(br.readLine());

       int [] distance = new int [N-1];

       for(int i = 0; i < N-1; i++){
        distance[i] = Integer.parseInt(st.nextToken());
       }

       st = new StringTokenizer(br.readLine());

       int [] cost = new int[N];

       for(int i = 0; i < N; i++){
        cost[i] = Integer.parseInt(st.nextToken());
       }

       int minCost = Integer.MAX_VALUE;
       int sum = 0;

       for(int i = 0; i < N-1; i++){
        if(cost[i] < minCost){
            minCost = cost[i];
        }
        sum += (minCost * distance[i]);
       }

       System.out.println(sum);
    }
}
