import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = factorial(N) / (factorial(K) * factorial(N-K));
        System.out.println(answer);
    }

    static int factorial(int num){
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
}
