import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        while(true){
            int k = Integer.parseInt(br.readLine());

            if(k == -1){
                break;
            }else if(k == 0){
                q.poll();
            }else{
                q.offer(k);
            }
        }

        if(q.size() > N){
            System.out.println("empty");
        }else{
            for(int item : q){
                System.out.print(item+" ");
            }
        }
        
    }
}