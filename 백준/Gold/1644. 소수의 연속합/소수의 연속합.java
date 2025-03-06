import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> prime = new ArrayList<>();

    public static void isPrime(int num){
        int [] temp = new int[num+1];

        for(int i = 2; i <= num; i++){
            temp[i] = i;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(temp[i] != 0){
                for(int j = i+i; j <= num; j+=i){
                    temp[j] = 0;
                }
            }
        }

        for(int i = 2; i <= num; i++){
            if(temp[i] != 0) prime.add(temp[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int answer = 0;
        int lt = 0;

        isPrime(N);

        for(int rt = 0; rt < prime.size(); rt ++){
            sum += prime.get(rt);

            if(sum == N){
                answer ++;
            }
            while( sum >= N){
                sum -= prime.get(lt);
                lt++;

                if(sum == N){
                    answer ++;
                }
            }
        }

        System.out.println(answer);
    }
}