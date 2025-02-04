import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        int [] lst = new int[N];
        
        for(int i = 0; i < N; i++){
            lst[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lst);

        for(int result : lst){
            sb.append(result).append("\n");
        }
        
        System.out.println(sb);
    }
}