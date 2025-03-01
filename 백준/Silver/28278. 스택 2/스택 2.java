import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

         Stack<Integer> stack = new Stack<>();

         for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(Integer.parseInt(st.nextToken())){
                case 1:
                stack.push(Integer.parseInt(st.nextToken()));
                break;

                case 2:
                if(!stack.isEmpty()){
                    System.out.println(stack.pop());
                }else{
                    System.out.println(-1);
                }
                break;

                case 3:
                System.out.println(stack.size());
                break;

                case 4:
                if(stack.isEmpty()){
                    System.out.println(1);
                }else System.out.println(0);
                break;

                case 5:
                if(!stack.isEmpty()){
                    System.out.println(stack.peek());
                }else{
                    System.out.println(-1);
                }
                break;
            }

            

            
         }
    }
    
}