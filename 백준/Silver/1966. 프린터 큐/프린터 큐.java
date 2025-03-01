import java.io.*;
import java.util.*;

public class Main {
    public static class Doc{
        int order;
        int prior;

        public Doc(int order, int prior){
            this.order = order;
            this.prior = prior;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        
        for(int i = 0; i < T; i++){
            int answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); 
            int M = Integer.parseInt(st.nextToken()); 

            Queue<Doc> q = new LinkedList<>();
            
            int [] arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                q.offer(new Doc(j,arr[j]));
            }

            while(!q.isEmpty()){
                Doc temp = q.poll();
                for(Doc item : q){
                    if(item.prior > temp.prior){
                        q.offer(temp);
                        temp = null;
                        break;
                    }
                }
                if(temp != null){
                    answer ++;
                    if(temp.order == M){
                        sb.append(answer).append("\n");
                    }
                }
            }
        }
        System.out.println(sb);
    }
    
}