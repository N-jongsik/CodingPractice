import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int [] lst = new int[N];

        for(int i = 0; i < N; i++){
            lst[i] = Integer.parseInt(br.readLine());
        }

        int lt = 0, answer = 5;

        Arrays.sort(lst);

        for(int rt = 0; rt < N; rt++){
            while(lt < N && lst[rt] - lst[lt] >= 5){
                lt++;
            }

            int count = rt-lt+1;
           answer = Math.min(answer, 5 - count);
        }
        System.out.println(answer);
    }
}
