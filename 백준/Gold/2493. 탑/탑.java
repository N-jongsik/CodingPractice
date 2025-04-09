import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int [] top = new int [N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 1; i <= N; i++){
            top[i] = Integer.parseInt(st.nextToken());
        }

        Stack<int []> stack = new Stack<>();
        
        for(int i = 1; i <= N; i++){
            while(!stack.isEmpty()){
                if(stack.peek()[0] > top[i]){
                    sb.append(stack.peek()[1] + " ");
                    break;
                }
                stack.pop();
            }

            if(stack.isEmpty()){
                sb.append(0 + " ");
            }

            stack.push(new int [] {top[i], i});  // 무조건 push
        }
        System.out.println(sb);
    }
}
