import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int [] lst = new int [N];
        int [] answer = new int [N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            while(!stack.isEmpty() && lst[stack.peek()] < lst[i]){
                answer[stack.pop()] = lst[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int item = stack.pop();
            answer[item] = -1;
        }

        StringBuilder sb = new StringBuilder();

        for(int item : answer){
            sb.append(item + " ");
        }

        System.out.println(sb);
    }
}
