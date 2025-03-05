import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] lst = new int[N];

        for(int i = 0; i < N; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        int result = Integer.MIN_VALUE;
        int lt = 0, rt = N-1;

        while(lt < rt){
            int min = Math.min(lst[rt],lst[lt]);
            int gap = rt-lt-1;

            result = Math.max(result,min*gap);

            if(lst[lt] < lst[rt]){
                lt++;
            }else rt--;
        }

        System.out.println(result);
    }
}