import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int [][] buildings = new int[n][2];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            buildings[i][0] = Integer.parseInt(st.nextToken());
            buildings[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(buildings,(a,b) -> a[0]-b[0]);

        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for(int [] building : buildings){
            int x = building[0];
            int y = building[1];

            if(y == 0){
                answer += stack.size();
                stack.clear();
                continue;
            }

            while(!stack.isEmpty() && stack.peek() > y){
                stack.pop();
                answer+=1;
            }

            if(stack.isEmpty() || stack.peek() < y){
                stack.push(y);
            }
        }

        System.out.println(answer + stack.size());
    }
}