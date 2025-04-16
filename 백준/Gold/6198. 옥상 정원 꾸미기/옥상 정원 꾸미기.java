import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();

        long result = 0;

        for(int i = 0; i < N; i++){
            int height = Integer.parseInt(br.readLine());

            while(!st.isEmpty() && st.peek() <= height){
                st.pop();
            }

            result += st.size();
            st.push(height);
        }

        System.out.println(result);
    }
}
