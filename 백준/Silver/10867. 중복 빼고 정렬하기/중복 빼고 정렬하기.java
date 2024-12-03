import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");

        int [] lst = new int[n];

        for(int i = 0; i < n; i++){
            lst[i] = Integer.parseInt(input[i]);
        }

        Set<Integer> set = new HashSet<>();
        for(int item : lst){
            set.add(item);
        }

        ArrayList<Integer> array = new ArrayList<>(set);
        Collections.sort(array);

        StringBuilder sb = new StringBuilder();

        for(int item: array){
            sb.append(item).append(" ");
        }

        System.out.println(sb.toString());
    }
}