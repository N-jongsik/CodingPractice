import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        List<Integer> lst = new ArrayList<>();

        for(int i = 0; i < N; i++){
            lst.add(Integer.parseInt(br.readLine()));
        }        

        Collections.sort(lst);
        
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            max = Math.max(lst.get(i)*(N-i), max);
        }
        System.out.println(max);
    }
}