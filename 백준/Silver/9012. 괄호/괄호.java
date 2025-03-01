import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++){
            Stack<Character> st = new Stack<>();
            char [] ch = br.readLine().toCharArray();
            for(char item : ch){
                if(!st.isEmpty() && item == ')' && st.peek() == '('){
                    st.pop();
                }else{
                    st.push(item);
                }
            }
            if(st.isEmpty()){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}