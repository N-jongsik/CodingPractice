import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());

        

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                StringBuilder sb1 = new StringBuilder();
                sb1.append(st.nextToken()).reverse();
                sb.append(sb1).append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
        
    }
}