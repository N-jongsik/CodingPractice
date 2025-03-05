import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); 
        int answer = 0;
        int sum = 0;

        int i = 1;

        for(int rt = 1; rt <= N; rt ++){
            sum += rt;
            if(sum == N) answer ++;
            while(sum >= N){
                sum -= i;
                i++;
                if(sum == N) answer ++;
            }
        }
        System.out.println(answer);
    }
}
