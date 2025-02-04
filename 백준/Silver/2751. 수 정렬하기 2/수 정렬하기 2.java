import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 0; i < N; i++){
            lst.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(lst);

        for(int result : lst){
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}